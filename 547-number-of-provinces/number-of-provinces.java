class Solution {
    private void dfs(int node,int[][] isConnected,boolean[] vis){
        vis[node]=true;
        int n=isConnected.length;
        for(int j=0;j<n;j++){
            if(isConnected[node][j]==1 && !vis[j]) dfs(j,isConnected,vis);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n];
        int province=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                province++;
            }
        }
        return province;
    }
}