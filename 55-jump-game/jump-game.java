class Solution {
    private boolean solve(int[] nums,int i,int[] dp){
        if(i>=nums.length-1) return true;
        if(dp[i]!=-1) return dp[i]==1? true:false;
        if(nums[i]>=nums.length-i-1) return true;
        for(int idx=1;idx<=nums[i];idx++){
            if(solve(nums,i+idx,dp)){
                dp[i]=1;
                return true;
            }
        }
        dp[i]=0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
}