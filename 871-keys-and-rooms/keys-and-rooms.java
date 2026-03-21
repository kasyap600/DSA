class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] vis=new boolean[n];
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            List<Integer> key=rooms.get(node);
            for(int it:key){
                if(!vis[it]){
                    q.add(it);
                    vis[it]=true;
                }
            }
        }
        for(boolean b:vis){
            if(!b) return b;
        }
        return true;
    }
}