class Solution {
    private int dfs(int[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0) return 1;
        if(grid[row][col]==-1) return 0;
        
        grid[row][col]=-1;

        return (dfs(grid,row+1,col)+
                dfs(grid,row-1,col)+
                dfs(grid,row,col+1)+
                dfs(grid,row,col-1));
    }
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int perimeter=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    perimeter+=dfs(grid,i,j);
                }
            }
        }
        return perimeter;
    }
}