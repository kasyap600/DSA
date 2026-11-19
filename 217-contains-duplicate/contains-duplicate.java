class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.getOrDefault(num,0)>1) return true;
            map.put(num,map.getOrDefault(0,1)+1);
        }
        return false;
    }
}