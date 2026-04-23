class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long[] ans=new long[n];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> l:map.values()){
            int size=l.size();
            long[] prefix=new long[size];
            prefix[0]=l.get(0);
            for(int i=1;i<size;i++){
                prefix[i]=prefix[i-1]+l.get(i);
            }
            for(int i=0;i<size;i++){
                int idx=l.get(i);
                long left=0,right=0;
                if(i>0) left=(long) i*idx-prefix[i-1];
                if(i<size-1) right=(prefix[size-1]-prefix[i])- (long)(size-i-1)*idx;
                ans[idx]=left+right;
            }
        }
        return ans;
    }
}