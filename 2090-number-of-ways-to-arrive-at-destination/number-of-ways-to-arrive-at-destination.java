class Solution {
    public int countPaths(int n, int[][] roads) {
        int mod=(int) 1e9+7;
        List<int[]>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++) adj[i]=new ArrayList<>();

        for(int[] r:roads){
            adj[r[0]].add(new int[]{r[1],r[2]});
            adj[r[1]].add(new int[]{r[0],r[2]});
        }
        int[] ways=new int[n];
        long[] dist=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        ways[0]=1;
        PriorityQueue<long[]> pq=new PriorityQueue<>(Comparator.comparingLong(a->a[0]));
        pq.add(new long[]{0,0});
        while(!pq.isEmpty()){
            long[] cur=pq.poll();
            long time=cur[0];
            int node=(int) cur[1];
            for(int[] it:adj[node]){
                int adjnode=it[0];
                int traveltime=it[1];
                if(dist[adjnode]>time+traveltime){
                    dist[adjnode]=time+traveltime;
                    ways[adjnode]=ways[node];
                    pq.add(new long[]{time+traveltime,adjnode});
                }
                else if(dist[adjnode]==time+traveltime){
                    ways[adjnode]=(ways[node]+ways[adjnode])%mod;
                }
            }
        }
        return ways[n-1]%mod;
    }
}