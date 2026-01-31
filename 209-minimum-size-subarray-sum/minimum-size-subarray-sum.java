class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int len=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        int right=0;
        while(right<n){
            sum+=nums[right];
            while(sum>=target){
                sum-=nums[left];
                len=Math.min(len,right-left+1);
                left++;
            }
            right++;
        }
        return len==Integer.MAX_VALUE ? 0:len;
    }
}