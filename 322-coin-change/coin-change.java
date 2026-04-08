class Solution {
    private int solve(int[] coins,int tar,int[][] dp,int i){
        if(tar==0) return 0;
        if(i>=coins.length) return (int)1e9;
        if(dp[i][tar]!=-1) return dp[i][tar];
        int not=solve(coins,tar,dp,i+1);
        int pick=(int) 1e9;
        if(coins[i]<=tar){
            pick=1+solve(coins,tar-coins[i],dp,i);
        }
        return dp[i][tar]=Math.min(pick,not);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] r:dp) Arrays.fill(r,-1);
         
        int ans= solve(coins,amount,dp,0);
        return ans>=(int) 1e9 ? -1 :ans;
    }
}