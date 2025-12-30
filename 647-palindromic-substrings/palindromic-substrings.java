class Solution {
    private boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        if(s==null || s.length()<1) return 0;
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)) cnt++;
            }
        }
        return cnt;
    }
}