class Solution {
    private boolean IsPossible(char[][] grid,int row,int col,char d){
        for(int i=0;i<9;i++){
            if(grid[row][i]==d || grid[i][col]==d) return false;
        }
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(grid[i][j]==d) return false;
            }
        }
        return true;
    }
    private boolean solve(char[][] grid){
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='.'){
                    for(char d='1';d<='9';d++){
                        if(IsPossible(grid,i,j,d)){
                            grid[i][j]=d;
                            if(solve(grid)) return true;
                            else grid[i][j]='.';       
                        }
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}