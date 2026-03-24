class Solution {
   
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)-> b[0]-a[0]
        );
        int n=points.length;
        for(int i=0;i<n;i++){
            int x=points[i][0];
            int y=points[i][1];
            int dist= x*x +y*y;
            pq.add(new int[]{dist,i});
            if(pq.size()>k) pq.poll();
        }
        for(int i=0;i<k;i++){
            int[] temp=pq.poll();
            int idx=temp[1];
            ans[i]=points[idx];
        }
        return ans;
    }
}