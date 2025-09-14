class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left=0,right=0;
        for(int num:nums) right+=num;
        for(int i=0;i<n;i++){
            int val=nums[i];
            right-=val;
            nums[i]=Math.abs(left-right);
            left+=val;
        }
        return nums;
    }
}