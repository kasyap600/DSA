class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n=nums.length;
        List<Boolean> list=new ArrayList<>();
        int val=0;
        for(int num:nums){
            val=(val*2+num)%5;
            list.add(val==0);
        }
        return list;
    }
}