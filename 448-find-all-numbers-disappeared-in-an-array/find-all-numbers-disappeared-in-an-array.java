class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        boolean[] list=new boolean[nums.length+1];
        for(int num:nums){
            list[num]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(list[i]==false) ans.add(i);
        }
        return ans;
    }
}