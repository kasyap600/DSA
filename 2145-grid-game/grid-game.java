class Solution {
    public long gridGame(int[][] grid) {
        long ans=Long.MAX_VALUE;
        long sum=0;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            sum+=grid[0][i];
        }
        long sum2=0;
        for(int i=0;i<n;i++){
            sum-=grid[0][i];
            ans=Math.min(ans,Math.max(sum,sum2));
            sum2+=grid[1][i];
        }
        return ans;
    }
}