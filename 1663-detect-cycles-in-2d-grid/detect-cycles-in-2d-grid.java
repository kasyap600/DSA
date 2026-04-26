class Solution {
    private int[] dx={-1,0,1,0};
    private int[] dy={0,1,0,-1};
    public boolean containsCycle(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]){
                    if(dfs(i,j,-1,-1,grid,vis)) return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int x,int y,int px,int py,char[][] grid,boolean[][] vis){
        vis[x][y]=true;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
            if(grid[nx][ny]!=grid[x][y]) continue;
            if(vis[nx][ny] && !(nx==px && ny==py)) return true;
            if(!vis[nx][ny]){
                if(dfs(nx,ny,x,y,grid,vis)) return true;
            }
        }
        return false;
    }
}