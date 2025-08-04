class Solution {
    private boolean dfs(int node,int[][] graph,boolean[] vis,boolean[] pathvis,boolean[] check) {
        vis[node]=true;
        pathvis[node]=true;
        check[node]=false;
        for(int it:graph[node]){
            if(!vis[it]){
                if(dfs(it,graph,vis,pathvis,check)) return true;
            }
            else if(pathvis[it]) return true;
        }
        check[node]=true;
        pathvis[node]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        boolean[] vis=new boolean[n];
        boolean[] pathvis=new boolean[n];
        boolean[] check=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,graph,vis,pathvis,check);
            }
        }
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(check[i]) temp.add(i);
        }
        return temp;
    }
}