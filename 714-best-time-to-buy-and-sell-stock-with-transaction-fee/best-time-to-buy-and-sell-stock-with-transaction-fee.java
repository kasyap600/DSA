class Solution {
    private int solve(int[] prices,int[][] dp,int i,int canBuy,int fee){
        if(i>=prices.length) return 0;
        if(dp[i][canBuy]!=-1) return dp[i][canBuy];
        int profit=0;
        int idle=solve(prices,dp,i+1,canBuy,fee);
        if(canBuy==1){
        
            int buy=-prices[i]+solve(prices,dp,i+1,0,fee);
            profit=Math.max(idle,buy);
        }
        else{
            //int idle=solve(prices,dp,i+1,canBuy,fee);
            int sell=prices[i]+solve(prices,dp,i+1,1,fee)-fee;
            profit=Math.max(idle,sell);
        }
        return dp[i][canBuy]=profit;
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] r:dp) Arrays.fill(r,-1);
        return solve(prices,dp,0,1,fee);
    }
}