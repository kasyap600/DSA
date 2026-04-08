class Solution {
    private int solve(int[] prices,int[][] dp,int i,int canBuy){
        if(i>=prices.length) return 0;
        if(dp[i][canBuy]!=-1) return dp[i][canBuy];
        int profit=0;
        if(canBuy==1){
            int idle=solve(prices,dp,i+1,canBuy);
            int buy=-prices[i]+solve(prices,dp,i+1,0);
            profit=Math.max(idle,buy);
        }
        else{
            int idle=solve(prices,dp,i+1,canBuy);
            int sell=prices[i]+solve(prices,dp,i+2,1);
            profit=Math.max(idle,sell);
        }
        return dp[i][canBuy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] r:dp) Arrays.fill(r,-1);
        return solve(prices,dp,0,1);

    }
}