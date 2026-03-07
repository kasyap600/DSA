class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>[] freq=new List[n+1];
        for(int i=0;i<=n;i++){
            freq[i]=new ArrayList<>();
        }
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int idx=0;
        for(int i=freq.length-1;i>0 && idx<k;i--){
            for(int num:freq[i]){
                ans[idx++]=num;
                if(idx==k) return ans;
            }
        }
        return ans;
    }
}