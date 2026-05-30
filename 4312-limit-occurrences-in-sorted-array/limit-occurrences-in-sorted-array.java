class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> ls=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int freq=map.getOrDefault(nums[i],0);
            if(freq<k){
                ls.add(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}