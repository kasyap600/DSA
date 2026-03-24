class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans=new int[k];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
            if(pq.size()>k) pq.poll();    
        }
        int[][] temp = new int[k][2];
        for (int i = 0;i<k;i++) {
            temp[i] = pq.poll();
        }
        Arrays.sort(temp,(a,b)->a[1]-b[1]);
        for(int i=0;i<k;i++){
            ans[i]=temp[i][0];
        }
        
        return ans;
    }
}