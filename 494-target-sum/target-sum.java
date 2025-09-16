class Solution {
    private int mod=(int) 1e9+7;
    private int func(int i,int target,int[] nums,int[][] dp){
        if(i==0){
            if(target==0 && nums[0]==0) return 2;
            if(target==0 || nums[0]==target) return 1;
            return 0;
        }
        if(dp[i][target] != -1) return dp[i][target];
        int notpick=func(i-1,target,nums,dp);
        int pick=0;
        if(nums[i]<=target){
            pick=func(i-1,target-nums[i],nums,dp);
        }
        return dp[i][target]=(notpick+pick)%mod;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int total=0;
        for(int num:nums) total+=num;
        if(total-target<0) return 0;
        if((total-target)%2==1) return 0;
        int s2=(total-target)/2;
        int[][] dp=new int[n][s2+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return func(n-1,s2,nums,dp);
    }
}