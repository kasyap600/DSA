class Solution {    
    private int solve(int[] coins,int tar,int[][] dp,int i){
        if(tar==0) return 1;
        if(i>=coins.length) return 0;
        if(dp[i][tar]!=-1) return dp[i][tar];
        int not=solve(coins,tar,dp,i+1);
        int pick=0;
        if(coins[i]<=tar){
            pick=solve(coins,tar-coins[i],dp,i);
        }
        return dp[i][tar]=pick+not;

    }

    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] r:dp) Arrays.fill(r,-1);
        return solve(coins,amount,dp,0);

    }
}