class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if(src==dst) return 0;
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] f:flights){
            adj.get(f[0]).add(new int[]{f[1],f[2]});
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,src,0});
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int steps=cur[0];
            int node=cur[1];
            int dis=cur[2];
            if(steps>k) continue;
            for(int[] it:adj.get(node)){
                int adjnode=it[0];
                int edgewt=it[1];
                if(dis+edgewt<dist[adjnode]){
                    dist[adjnode]=dis+edgewt;
                    q.add(new int[]{steps+1,adjnode,dis+edgewt});
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE) return -1;
        return dist[dst];
    }
}