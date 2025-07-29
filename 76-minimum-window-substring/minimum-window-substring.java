class Solution {
    public String minWindow(String s, String t) {
        //your code goes here
        int minLen=Integer.MAX_VALUE;
        int sIndex=-1;
        int[] hash=new int[256];
        for(char c:t.toCharArray()){
            hash[c]++;
        }
        int cnt=0;
        int l=0,r=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]>0) cnt++;
            hash[s.charAt(r)]--;
            while(cnt==t.length()){
                if(r-l+1 < minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return (sIndex==-1)? "":s.substring(sIndex,sIndex+minLen);
    }
}