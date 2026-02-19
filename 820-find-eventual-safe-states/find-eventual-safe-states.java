class Solution {
    private boolean dfs(int[][] graph,int node,boolean[] vis,boolean[] pathvis,boolean[] check){
        vis[node]=true;
        pathvis[node]=true;
      
        for(int it:graph[node]){
            if(!vis[it]){
                if(dfs(graph,it,vis,pathvis,check)) return true;
            }
            else if(pathvis[it]) return true;
        }
        check[node]=true;
        pathvis[node]=false;
        return false;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> path=new ArrayList<>();
        int n=graph.length;
        boolean[] vis=new boolean[n];
        boolean[] pathvis=new boolean[n];
        boolean[] check=new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]) dfs(graph,i,vis,pathvis,check);
        }
        for(int i=0;i<n;i++){
            if(check[i]) path.add(i);
        }
        return path;
    }
}