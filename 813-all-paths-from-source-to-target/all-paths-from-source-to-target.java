class Solution {
    private void dfs(int[][] graph,int node,List<Integer> path,List<List<Integer>> ans){
        path.add(node);
        if(node==graph.length-1){
            ans.add(new ArrayList<>(path));
        }
       
        for(int it:graph[node]){
            dfs(graph,it,path,ans);
         }
        
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(graph,0,path,ans);
        return ans;
    }
}