class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int l=0,r=0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                sum-=nums[l];
                ans=Math.min(ans,r-l+1);
                l++;
            }

            r++;
        }
        return ans==Integer.MAX_VALUE ? 0:ans;
    }
}