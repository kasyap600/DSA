class Solution {
    private int func(int i,int buy,int cap,int n,int[] arr,int[][][] dp){
        if(i==n || cap==0) return 0;
        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];
        int profit=0;
        if(buy==0){
            profit=Math.max(0+func(i+1,0,cap,n,arr,dp),-arr[i]+func(i+1,1,cap,n,arr,dp));
        }
        if(buy==1){
            profit=Math.max(0+func(i+1,1,cap,n,arr,dp),arr[i]+func(i+1,0,cap-1,n,arr,dp));
        }
        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3];
        for(int i=0;i<n;i++)
            for(int a=0;a<2;a++)
                for(int b=0;b<3;b++)
                    dp[i][a][b]=-1;
        return func(0,0,2,n,prices,dp);
    }
}

//0-> buy
//1-> sell After selling you reduce the cap 
// because one buy and one sell is considered as one transaction so you reduce after selling