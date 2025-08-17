class Solution {
    private boolean dfs(char[][] board, String word, boolean[][] vis, int i, int j, int index) {
        if (index == word.length())
            return true;
        int n = board.length;
        int m = board[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m || vis[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        vis[i][j] = true;
        if (dfs(board, word, vis, i + 1, j, index + 1) ||
                dfs(board, word, vis, i - 1, j, index + 1) ||
                dfs(board, word, vis, i, j + 1, index + 1) ||
                dfs(board, word, vis, i, j - 1, index + 1)) {
            return true;
        }
        vis[i][j] = false;
        return false;

    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        boolean res = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    res = dfs(board, word, vis, i, j, 0);
                    if (res)
                        return true;
                }

            }
        }
        return false;
    }
}