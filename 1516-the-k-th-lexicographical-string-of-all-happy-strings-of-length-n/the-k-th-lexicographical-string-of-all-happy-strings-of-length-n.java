class Solution {
    
    private void solve(List<String> ls,int n,int k,String s){
        if(s.length()==n){
            ls.add(s);
            return;
        }
        for(char ch='a';ch<='c';ch++){
            if(s.length()==0 || s.charAt(s.length()-1)!=ch){
                solve(ls,n,k,s+ch);
            }
        }
    }
    public String getHappyString(int n, int k) {
        List<String> ls=new ArrayList<>();
        
        solve(ls,n,k,"");
        if(k>ls.size()) return "";
        return ls.get(k-1);

    }
}