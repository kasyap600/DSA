class Solution {
    public int maxFreqSum(String s) {
        boolean[] vowel=new boolean[26];
        for(char c:new char[]{'a','e','i','o','u'}){
            vowel[c-'a']=true;
        }
        int[] vow=new int[26];
        int[] con=new int[26];
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(vowel[idx]){
                vow[idx]++;
            }
            else con[idx]++;
        }

        int vowfreq=0;
        int confreq=0;
        for(int i=0;i<26;i++){
            vowfreq=Math.max(vowfreq,vow[i]);
            confreq=Math.max(confreq,con[i]);
        }
        return vowfreq+confreq;
        
    }
}