class Solution {
    private int solve(int[] nums,int i,int[] dp){
        if(i>=nums.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int curr=nums[i];
        int ans=Integer.MAX_VALUE;
        if(curr==0) return ans;

        for(int idx=1;idx<=curr;idx++){
            int next=solve(nums,idx+i,dp);
            if(next!=Integer.MAX_VALUE)
                ans=Math.min(ans,1+next);
        }
        return dp[i]=ans;

    }
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
}