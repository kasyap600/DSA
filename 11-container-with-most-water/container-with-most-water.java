class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxi=0;
        int left=0,right=n-1;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            if(area>maxi) maxi=area;
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxi;
    }
}