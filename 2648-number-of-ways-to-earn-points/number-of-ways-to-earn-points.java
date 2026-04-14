class Solution {

    private int mod=(int) 1e9+7;
    private int solve(int i,int tar,int[][] types,int[][] dp){
        if(tar==0) return 1;
        if(i==types.length) return 0;
        if(dp[i][tar]!=-1) return dp[i][tar];
        int cnt=types[i][0];
        int marks=types[i][1];
        int ways=0;
        for(int k=0;k<=cnt;k++){
            int ntar=tar-k*marks;
            if(ntar<0) break;
            ways=(ways+solve(i+1,ntar,types,dp))%mod;
        }
        return dp[i][tar]=ways;
    }
    public int waysToReachTarget(int target, int[][] types) {
        int n=types.length;
        int[][] dp=new int[n+1][target+1];
        for(int[] r:dp) Arrays.fill(r,-1);
        return solve(0,target,types,dp);
    }
}