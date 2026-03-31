class DisjointSet{
    int[] rank,parent;
    DisjointSet(int n){
        rank=new int[n+1];
        parent=new int[n+1];
        for(int i=0;i<=n;i++) parent[i]=i;
    }
    int findUPar(int node){
        if(node==parent[node]) return node;
        return parent[node]=findUPar(parent[node]);
    }
    void unionByRank(int u,int v){
        int ulp_u=findUPar(u);
        int ulp_v=findUPar(v);
        if(rank[ulp_u] < rank[ulp_v]) parent[ulp_u]=ulp_v;
        else if(rank[ulp_u] > rank[ulp_v]) parent[ulp_v]=ulp_u;
        else{
            parent[ulp_v]=ulp_u;
            rank[ulp_u]++;
        }

    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int size=connections.length;
        if(size<n-1) return -1;
        DisjointSet ds=new DisjointSet(n);
        for(int i=0;i<size;i++){
            ds.unionByRank(connections[i][0],connections[i][1]);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(ds.parent[i]==i) cnt++;
        }
        return cnt-1;
    }
}