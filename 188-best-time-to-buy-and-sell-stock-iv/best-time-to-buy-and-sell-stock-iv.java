class Solution {
    private int func(int i,int buy,int cap,int n,int[] arr,int[][][] dp){
        if(i==n || cap==0) return 0;
        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];
        int profit=0;

        if(buy==0){
            profit=Math.max(0+func(i+1,0,cap,n,arr,dp),-arr[i]+func(i+1,1,cap,n,arr,dp));
        }
        if(buy==1){
            profit=Math.max(0+func(i+1,1,cap,n,arr,dp) , arr[i]+func(i+1,0,cap-1,n,arr,dp));
        }
        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        int[][][] dp=new int[n][2][k+1];
        for(int i=0;i<n;i++)
            for(int j=0;j<2;j++)
                for(int a=0;a<=k;a++)
                    dp[i][j][a]=-1;
        return func(0,0,k,n,prices,dp);
    }
}