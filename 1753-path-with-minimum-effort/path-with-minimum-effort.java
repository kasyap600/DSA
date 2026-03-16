class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] dist=new int[n][m];
        for(int[] row:dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        //dist,r,c
        pq.add(new int[]{0,0,0});
        int[] delr={-1,0,1,0};
        int[] delc={0,1,0,-1};
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int dis=cur[0];
            int r=cur[1];
            int c=cur[2];
            if(r==n-1 && c==m-1) return dis;
            for(int i=0;i<4;i++){
                int nr=r+delr[i];
                int nc=c+delc[i];
                if(isValid(nr,nc,n,m)){
                    int curdis=Math.abs(heights[nr][nc]-heights[r][c]);
                    if(Math.max(dis,curdis) < dist[nr][nc]){
                        dist[nr][nc]=Math.max(dis,curdis);
                        pq.add(new int[]{Math.max(dis,curdis),nr,nc});
                    }
                }
            }
        }
        return -1;
    }
    private boolean isValid(int r,int c,int n,int m){
        if(r<0 || r>=n || c>=m || c<0) return false;
        return true;
    }
}