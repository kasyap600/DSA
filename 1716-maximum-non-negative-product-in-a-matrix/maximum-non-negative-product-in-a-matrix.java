class Solution {
    public int maxProductPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long mod=(int)1e9+7;
        long[][] max=new long[n][m];
        long[][] min=new long[n][m];
        min[0][0]=max[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            max[i][0]=min[i][0] = max[i-1][0]*grid[i][0];
        }
        for(int j=1;j<m;j++){
            max[0][j]=min[0][j]=max[0][j-1]*grid[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                long val=grid[i][j];

                long a=max[i-1][j]*val;
                long b=min[i-1][j]*val;
                long c=max[i][j-1]*val;
                long d=min[i][j-1]*val;
                max[i][j]=Math.max(Math.max(a,b),Math.max(c,d));
                min[i][j]=Math.min(Math.min(a,b),Math.min(c,d));

            }
        }
        long ans=max[n-1][m-1];
        if(ans<0) return -1;
        return (int) (ans%mod);
    }
}