class Solution {
    private void solve(int i,int sum,int n,int k,List<List<Integer>> ans,List<Integer> nums){
        if(sum==n && nums.size()==k){
            ans.add(new ArrayList<>(nums));
            return;
        }
        if(sum<0 || i>9) return;
        nums.add(i);
        solve(i+1,sum+i,n,k,ans,nums);
        nums.remove(nums.size()-1);
        solve(i+1,sum,n,k,ans,nums);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(1,0,n,k,ans,new ArrayList<>());
        return ans;
    }
}