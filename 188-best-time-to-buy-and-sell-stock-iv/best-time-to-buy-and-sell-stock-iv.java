class Solution {
    private int solve(int[] prices,int[][][] dp,int trans,int k,int i,int canBuy){
        if(i>=prices.length || trans>=k) return 0;
        if(dp[i][canBuy][trans] != -1) return dp[i][canBuy][trans];
        int profit=0;
        if(canBuy==1){
            int idle=solve(prices,dp,trans,k,i+1,canBuy);
            int buy=-prices[i]+solve(prices,dp,trans,k,i+1,0);
            profit=Math.max(idle,buy);
        }
        else{
            int idle=solve(prices,dp,trans,k,i+1,canBuy);
            int sell=prices[i]+solve(prices,dp,trans+1,k,i+1,1);
            profit=Math.max(idle,sell);
        }
        return dp[i][canBuy][trans]=profit;
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][k];
        for(int[][] mat:dp){
            for(int[] r:mat) Arrays.fill(r,-1); 
        }
        return solve(prices,dp,0,k,0,1);
    }
}