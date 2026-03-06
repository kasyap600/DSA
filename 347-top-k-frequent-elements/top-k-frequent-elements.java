class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)-> (map.get(b)-map.get(a)));
        int i=0;
        for(int num:ls){
            ans[i]=num;
            i++;
            if(i==k) break;
        }
        return ans;
    }
}