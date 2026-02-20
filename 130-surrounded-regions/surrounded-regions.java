class Solution {
    private void dfs(int i,int j,char[][] board,boolean[][] vis){
        int n=board.length;
        int m=board[0].length;
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || board[i][j]!='O') return;
        vis[i][j]=true;
        dfs(i,j-1,board,vis);
        dfs(i-1,j,board,vis);
        dfs(i+1,j,board,vis);
        dfs(i,j+1,board,vis);
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];
        //first row
        for(int j=0;j<m;j++){
            if(!vis[0][j] && board[0][j]=='O'){
                dfs(0,j,board,vis);
            }
            //last row
            if(!vis[n-1][j] && board[n-1][j]=='O'){
                dfs(n-1,j,board,vis);
            }
        }
        //first column
        for(int i=0;i<n;i++){
            if(!vis[i][0] && board[i][0]=='O'){
                dfs(i,0,board,vis);
            }
            //last column
            if(!vis[i][m-1] && board[i][m-1]=='O'){
                dfs(i,m-1,board,vis);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

        

    }
}