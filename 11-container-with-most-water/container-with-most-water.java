class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int total=0;
        while(left<right){
            int width=right-left;
            int area=Math.min(height[left],height[right])*width;
            total=Math.max(total,area);
            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        return total;
    }
}