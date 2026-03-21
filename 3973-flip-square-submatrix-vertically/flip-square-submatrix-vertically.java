class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] ans=grid;
        int n=grid.length;
        int m=grid[0].length;
        int top=x,bottom=x+k-1;
        while(top<bottom){
            for(int col=y;col<y+k;col++){
                int temp=ans[top][col];
                ans[top][col]=ans[bottom][col];
                ans[bottom][col]=temp;
            }
            top++;
            bottom--;
        }
        return ans;
    }
}