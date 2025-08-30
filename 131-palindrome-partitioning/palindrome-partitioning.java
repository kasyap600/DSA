class Solution {
    private boolean check(String s, int start,int end){
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    private void backtrack(int idx,List<List<String>> ans,List<String> path,String s){
        if(idx==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(check(s,idx,i)){
                path.add(s.substring(idx,i+1));
                backtrack(i+1,ans,path,s);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        if(s.length()==0) return ans;
        backtrack(0,ans,path,s);
        return ans;
    }
}