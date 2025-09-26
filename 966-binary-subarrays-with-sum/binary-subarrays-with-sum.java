class Solution {
    private int helper(int[] nums,int goal){
        if(goal<0) return 0;
        int n=nums.length;
        int l=0,r=0;
        int cnt=0;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l++];
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
}