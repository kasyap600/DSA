class Solution {
    private void solve(int i,int sum,List<Integer> list,List<List<Integer>> ans,int k){
        if(sum==0 && list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i<1 || sum<0) return;
        list.add(i);
        solve(i-1,sum-i,list,ans,k);
        list.remove(list.size()-1);
        solve(i-1,sum,list,ans,k);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(9,n,new ArrayList<>(),ans,k);
        return ans;
    }
}