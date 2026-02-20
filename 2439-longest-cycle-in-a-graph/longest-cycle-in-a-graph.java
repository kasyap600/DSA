class Solution {
    private int ans=-1;
    private void dfs(int node,int[] edges,Map<Integer,Integer> map,boolean[] vis,int step){
        if(node==-1) return;
        if(map.containsKey(node)){
            ans=Math.max(ans,step-map.get(node));
            return;
        }
        if(vis[node]) return;
        vis[node]=true;
        map.put(node,step);
        dfs(edges[node],edges,map,vis,step+1);
        map.remove(node);
    }
    public int longestCycle(int[] edges) {
        int n=edges.length;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                Map<Integer,Integer> map=new HashMap<>();
                dfs(i,edges,map,vis,0);
            }
        }
        return ans;
    }
}