class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums) pq.add(num);
        int cnt=0;
        int sub=0;
        while(!pq.isEmpty()){
            int num=pq.poll();
            if(num==0) continue;
            else{
                int top=num-sub;
                if(top!=0){
                    sub+=top;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}