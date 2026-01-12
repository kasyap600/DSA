class Solution {
    private void solve(List<Integer> v,int i,List<Integer> list,List<List<Integer>> ans){
        if(i<0){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(v.get(i));
        solve(v,i-1,list,ans);//pick
        list.remove(list.size()-1);
        solve(v,i-1,list,ans);//not pick
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> v=new ArrayList<>();
        for(int x:nums) v.add(x);
        solve(v,v.size()-1,new ArrayList<>(),ans);
        return ans;
    }
}