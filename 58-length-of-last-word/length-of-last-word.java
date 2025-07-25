class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int len=0;
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==' ' && len==0) continue;
            else if(c !=' ') len++;
            else break;
        }
        return len;
    }
}