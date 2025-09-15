class Solution {
    private int func(int i,int sum,int[] coins,int[][] dp){
        if(i==0){
            if(sum%coins[0]==0) return sum/coins[0];
            else return (int) 1e9;
        }
        if(dp[i][sum] != -1) return dp[i][sum];

        int notpick=0+func(i-1,sum,coins,dp);
        int pick=Integer.MAX_VALUE;

        if(coins[i]<=sum){
            pick=1+func(i,sum-coins[i],coins,dp);
        }
        return dp[i][sum]=Math.min(notpick,pick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=func(n-1,amount,coins,dp);
        if(ans==(int) 1e9) return -1;
        return ans;
    }
}