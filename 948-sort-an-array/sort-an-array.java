class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        int[] ans=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll();
        }
        return ans;
    }
}