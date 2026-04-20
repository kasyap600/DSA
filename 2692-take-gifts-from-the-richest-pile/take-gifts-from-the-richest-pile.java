class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n=gifts.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int g:gifts) pq.add(g);
        long ans=0;
        int sec=0;
        while(k-->0){
            int max=pq.poll();
            int rem=(int) Math.sqrt(max);
            pq.add(rem);
        }
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
        
    }
}