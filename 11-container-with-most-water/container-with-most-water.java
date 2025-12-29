class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxi=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int area=(right-left)*Math.min(height[left],height[right]);
            if(height[left]<height[right]) left++;
            else right--;
            maxi=Math.max(maxi,area);
            
        }
        return maxi;
    }
}