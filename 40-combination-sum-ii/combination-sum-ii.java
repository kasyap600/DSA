class Solution {
    private void solve(int idx,int sum,int[] candidates,List<List<Integer>> ans,List<Integer> nums){
        if(sum==0){
            ans.add(new ArrayList<>(nums));
            return;
        }
        if(sum<0 || idx==candidates.length) return;

        nums.add(candidates[idx]);
        solve(idx+1,sum-candidates[idx],candidates,ans,nums);

        nums.remove(nums.size()-1);
        
        for(int i=idx+1;i<candidates.length;i++){
            if(candidates[idx] !=candidates[i]){
                solve(i,sum,candidates,ans,nums);
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}