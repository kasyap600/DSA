class Solution {
    private int n, m;
    private char[][] A;
    private int[][] memo;
    private int dfs(int i, int j, char[][] matrix) {
        
        if (i == n || j == m) return 0;           
        if (memo[i][j] != -1) return memo[i][j];  

        int right = dfs(i, j + 1, matrix);
        int down  = dfs(i + 1, j, matrix);
        int diag  = dfs(i + 1, j + 1, matrix);

        if (A[i][j] == '1') {
            memo[i][j] = 1 + Math.min(right, Math.min(down, diag));
        } else {
            memo[i][j] = 0;
        }
        return memo[i][j];
    }
    public int maximalSquare(char[][] matrix) {
        n=matrix.length;
        m=matrix[0].length;
        A=matrix;
        memo=new int[n][m];
        for(int[] row:memo){
            Arrays.fill(row,-1);
        }
        int best=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                best=Math.max(best,dfs(i,j,matrix));
            }
        }
        return best*best;
    }
}