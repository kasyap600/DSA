class Solution {
    private int func(int i,int buy,int fee,int n,int[] arr,int[][] dp){
        if(i==n) return 0;
        if(dp[i][buy] != -1) return dp[i][buy];
        int profit=0;
        if(buy==0){
            profit=Math.max(0+func(i+1,0,fee,n,arr,dp),-arr[i]+func(i+1,1,fee,n,arr,dp));
        }
        if(buy==1){
            profit=Math.max(0+func(i+1,1,fee,n,arr,dp),arr[i]-fee+func(i+1,0,fee,n,arr,dp));
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row1:dp){
            Arrays.fill(row1,-1);
        }
        return func(0,0,fee,n,prices,dp);
    }
}