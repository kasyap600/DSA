class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] !=0) fresh++;
            }
        }
        if(fresh==0) return 0;
        int min=0,cnt=0;
        while(!q.isEmpty()){
            int size=q.size();
            cnt+=size;
            for(int i=0;i<size;i++){
                int[] point=q.poll();
                for(int j=0;j<4;j++){
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    if(x<0 || y<0 || x>=n ||y>=m ||grid[x][y]==0 || grid[x][y]==2) continue;
                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                }
            }
            if(q.size()!=0) min++;
        }
        return fresh==cnt?min:-1;
    }
}