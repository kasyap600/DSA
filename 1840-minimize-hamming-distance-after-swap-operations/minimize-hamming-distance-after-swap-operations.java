class Solution {
    private int[] parent;
    private int find(int x){
        if(parent[x]!=x) parent[x]=find(parent[x]);
        return parent[x];
    }
    private void union(int a,int b){
        int px=find(a);
        int py=find(b);
        if(px!=py) parent[px]=py;
    }
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n=source.length;
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] swap:allowedSwaps){
            union(swap[0],swap[1]);
        }
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int parent=find(i);
            map.computeIfAbsent(parent,k->new ArrayList<>()).add(i);
        }
        int dis=0;
        for(List<Integer> group:map.values()){
            Map<Integer,Integer> freq=new HashMap<>();
            for(int idx:group){
                freq.put(source[idx],freq.getOrDefault(source[idx],0)+1);
            }
            for(int idx:group){
                int val=target[idx];
                if(freq.getOrDefault(val,0)>0) freq.put(val,freq.get(val)-1);
                else dis++;
            }
        }
        return dis;
    }
}