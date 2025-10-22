class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int cnt=0;
        Map<Integer,Integer>[] map=new HashMap[n];
        for(int i=0;i<n;i++){
            map[i]=new HashMap<>();
            for(int j=0;j<i;j++){
                int diff=nums[i]-nums[j];
                int len=map[j].getOrDefault(diff,1)+1;
                map[i].put(diff,Math.max(map[i].getOrDefault(diff,0),len));
                cnt=Math.max(cnt,len);
            }
        }
        return cnt;
    }
}