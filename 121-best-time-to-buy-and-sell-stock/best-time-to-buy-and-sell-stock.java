class Solution {
    private int solve(int i,int k,int canBuy,int[] prices,int[][] dp){
        if(i>=prices.length || k==0) return 0;
        if(dp[i][canBuy] !=-1) return dp[i][canBuy];
        int profit=0;
        if(canBuy==1){
            int idle=solve(i+1,k,1,prices,dp);
            int buy=-prices[i] + solve(i+1,k,0,prices,dp);
            profit=Math.max(idle,buy);
        }
        else{
            int idle=solve(i+1,k,0,prices,dp);
            int sell=prices[i]+solve(i+1,k-1,1,prices,dp);
            profit=Math.max(idle,sell);
        }
        return dp[i][canBuy]=profit;
    } 
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(0,1,1,prices,dp);
        
    }
}