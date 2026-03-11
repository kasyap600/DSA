class Solution {
    private List<Integer> helper(int r){
        long ans=1;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<r;i++){
            ans*=(r-i);
            ans/=i;
            row.add((int)ans);
        }
        return row;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(helper(i));
        }
        return ans;
    }
}