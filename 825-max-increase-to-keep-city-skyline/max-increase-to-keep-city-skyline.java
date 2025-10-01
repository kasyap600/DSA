class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;

        int[] row=new int[n];
        int[] col=new int[n];

        for(int i=0;i<n;i++){
            int r=0,c=0;
            for(int j=0;j<n;j++){
                r=Math.max(r,grid[i][j]);
                c=Math.max(c,grid[j][i]);
                row[i]=r;
                col[i]=c;
            }
        }

        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=(Math.min(row[i],col[j]))-grid[i][j];
            }
        }
        return sum;
    }
}