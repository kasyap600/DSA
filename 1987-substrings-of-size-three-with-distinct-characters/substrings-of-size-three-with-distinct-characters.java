class Solution {
    public int countGoodSubstrings(String s) {
        char[] c=s.toCharArray();
        int n=c.length;
        int cnt=0;
        for(int i=0;i<=n-3;i++){
            if(c[i]!=c[i+1] && c[i+1]!=c[i+2] && c[i]!=c[i+2]) cnt++;
        }
        return cnt;
    }
}