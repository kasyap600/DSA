class Solution {
    private int solve(int i,int[] nums,int target,int[] dp){
        if(i==nums.length-1) return 0;
        if(dp[i]!=-2) return dp[i];
        int ans=-1;
        for(int j=i+1;j<nums.length;j++){
            if(Math.abs(nums[j] - nums[i]) <= target){
                int temp=solve(j,nums,target,dp);
                if(temp!=-1) ans=Math.max(ans,1+temp);
            }
        }
        return dp[i]=ans;
    }
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-2);
        return solve(0,nums,target,dp);

    }
}