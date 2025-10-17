class Solution {
    private void dfs(int i,int[][] isConnected,boolean[] vis){
        vis[i]=true;
        int n=isConnected.length;
        for(int j=0;j<n;j++){
            if(isConnected[i][j]==1 && !vis[j]){
                dfs(j,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n];
        int provinces=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                provinces++;
            }
        }  
        return provinces; 
    }
}