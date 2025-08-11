class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(map.containsKey(num)) return true;
            map.put(num,i);
        }
        return false;
    }
}