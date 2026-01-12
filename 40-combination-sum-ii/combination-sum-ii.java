class Solution {
    private void solve(List<Integer> v,int i,int sum,List<Integer> list,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i==v.size() || sum<0) return;

        list.add(v.get(i));
        solve(v,i+1,sum-v.get(i),list,ans);

        list.remove(list.size()-1);

        for(int idx=i+1;idx<v.size();idx++){
            if(v.get(idx)!=v.get(i)){
                solve(v,idx,sum,list,ans);
                break;
            }
        }


    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> v=new ArrayList<>();
        for(int x:candidates) v.add(x);
        solve(v,0,target,new ArrayList<>(),ans);
        return ans;
    }
}