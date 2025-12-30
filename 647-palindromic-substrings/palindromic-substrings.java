class Solution {
    private int count=0;

    public int countSubstrings(String s) {
        if(s.length()==0) return 0;
        for(int i=0;i<s.length();i++){
            solve(s,i,i);
            solve(s,i,i+1);
        }
        return count;
    }
    private void solve(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
    }
}