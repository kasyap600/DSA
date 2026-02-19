class Solution {
    private void dfs(int[][] image,int ini,int i, int j,int[] dx,int[] dy,int[][] ans , int color){
        ans[i][j]=color;
        int n=image.length;
        int m=image[0].length;
        for(int k=0;k<4;k++){
            int nr=i+dx[k];
            int nc=j+dy[k];
            if(nr<n && nc<m && nr>=0 && nc>=0 && image[nr][nc]==ini && ans[nr][nc]==ini){
                dfs(image,ini,nr,nc,dx,dy,ans,color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        if(image[sr][sc]==color) return ans;
        int inicolor=image[sr][sc];
        int[] dx={-1,0,1,0};
        int[] dc={0,1,0,-1};
        dfs(image,inicolor,sr,sc,dx,dc,ans,color);
        return ans;
    }
}