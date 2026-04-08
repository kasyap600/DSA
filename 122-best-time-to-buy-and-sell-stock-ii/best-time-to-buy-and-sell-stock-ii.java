class Solution {
    private int solve(int[] prices,int i,int buy,int[][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
            int idle=solve(prices,i+1,buy,dp);
            int bu=-prices[i]+solve(prices,i+1,0,dp);
            dp[i][buy]=Math.max(idle,bu);
        }
        else{
            int idle=solve(prices,i+1,buy,dp);
            int sell=prices[i]+solve(prices,i+1,1,dp);
            dp[i][buy]=Math.max(idle,sell);
        }
        return dp[i][buy];
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+1][2];
        for(int[] r:dp) Arrays.fill(r,-1);
        return solve(prices,0,1,dp);
    }
}