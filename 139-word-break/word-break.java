class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Set<String> st=new HashSet<>(wordDict);
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        int max=0;
        for(String word:wordDict){
            max=Math.max(max,word.length());
        }
        for(int i=1;i<=n;i++){
            for(int j=Math.max(0,i-max);j<i;j++){
                if(dp[j] && st.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}