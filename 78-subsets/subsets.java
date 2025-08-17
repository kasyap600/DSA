class Solution {
    private void createSubset(int[] nums,int  index,List<List<Integer>> ans,List<Integer> subset){
        if(index==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        createSubset(nums,index+1,ans,subset);

        subset.remove(subset.size()-1);
        createSubset(nums,index+1,ans,subset);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        createSubset(nums,0,ans,subset);
        return ans;
    }
}