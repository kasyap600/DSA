class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long[] hori=new long[n];
        long[] ver=new long[m];
        long tot=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                hori[i]+=grid[i][j];
                tot+=grid[i][j];
                ver[j]+=grid[i][j];
            }
        }
        if(tot%2!=0) return false;
        long upper=0;
        for(int i=0;i<n-1;i++){
            upper+=hori[i];
            if(upper==tot-upper) return true;
        }
        long left=0;
        for(int i=0;i<m-1;i++){
            left+=ver[i];
            if(left==tot-left) return true;
        }
        return false;

    }
}