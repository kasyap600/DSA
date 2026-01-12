class Solution {
    private void solve(List<Integer> v,int i,int sum,List<Integer> list,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum<0|| i<0){
            return;
        }
        list.add(v.get(i));
        solve(v,i,sum-v.get(i),list,ans); // pick
        list.remove(list.size()-1);
        solve(v,i-1,sum,list,ans);//not pick
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> v=new ArrayList<>();
        for(int x:candidates) v.add(x);
        solve(v,v.size()-1,target,new ArrayList<>(),ans);
        return ans;
    }
}