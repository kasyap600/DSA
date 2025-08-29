class Solution {
    private void solve(String digits,List<String> ans,int idx,String curr,String[] map){
        if(idx==digits.length()){
            ans.add(curr);
            return;
        }
        String s=map[digits.charAt(idx)-'0'];
        for(int i=0;i<s.length();i++){
            solve(digits,ans,idx+1,curr+s.charAt(i),map);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        String[] map=new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits,ans,0,"",map);
        return ans;
    }
}