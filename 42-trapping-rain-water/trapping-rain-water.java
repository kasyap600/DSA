class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int lmax=0,rmax=0;
        int total=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(lmax>height[left]) total+=lmax-height[left];
                else lmax=height[left];
                left++;
            }
            else{
                if(rmax>height[right]) total+=rmax-height[right];
                else rmax=height[right];
                right--;

            }
        }
        return total;
    }
}