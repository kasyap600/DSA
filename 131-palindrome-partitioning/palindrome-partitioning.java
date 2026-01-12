class Solution {
    private boolean check(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    private void solve(String s,int i,List<String> list,List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int idx=i;idx<s.length();idx++){
            if(check(s,i,idx)){
                list.add(s.substring(i,idx+1));
                solve(s,idx+1,list,ans);
                list.remove(list.size()-1);
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        if(s.length()==0) return ans;
        solve(s,0,new ArrayList<>(),ans);
        return ans;
    }
}