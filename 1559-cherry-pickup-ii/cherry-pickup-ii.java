class Solution {
    private int func(int i,int j1,int j2,int[][] grid,int[][][] dp){
        int n=grid.length;
        int m=grid[0].length;
        if(j1<0 || j1>=m || j2<0 || j2>=m) return (int) -1e9;

        if(i==n-1){
            if(j1==j2){
                return grid[i][j1];
            }
            else return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];
        int maxi=Integer.MIN_VALUE;
        for(int di=-1;di<=1;di++){
            for(int dj=-1;dj<=1;dj++){
                int ans;
                if(j1==j2){
                    ans=grid[i][j1]+func(i+1,j1+di,j2+dj,grid,dp);
                }
                else{
                    ans=grid[i][j1]+grid[i][j2]+func(i+1,j1+di,j2+dj,grid,dp);
                }
                maxi=Math.max(maxi,ans);
            }

        }
        return dp[i][j1][j2]=maxi;
    }
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n][m][m];
        for(int[][] row2:dp){
            for(int[] row1:row2){
                Arrays.fill(row1,-1);
            }
        }
        return func(0,0,m-1,grid,dp);
    }
}