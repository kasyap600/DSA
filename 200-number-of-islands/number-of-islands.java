class Solution {
  private void dfs(int i, int j, char[][] grid, boolean[][] vis) {
    int n = grid.length;
    int m = grid[0].length;
    if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != '1' || vis[i][j]) return;
    vis[i][j] = true;
    dfs(i, j - 1, grid, vis);
    dfs(i + 1, j, grid, vis);
    dfs(i, j + 1, grid, vis);
    dfs(i - 1, j, grid, vis);
  }

  public int numIslands(char[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    boolean[][] vis = new boolean[n][m];
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == '1' && vis[i][j] == false) {
          count++;
          dfs(i, j, grid, vis);
        }
      }
    }
    return count;
  }
}
