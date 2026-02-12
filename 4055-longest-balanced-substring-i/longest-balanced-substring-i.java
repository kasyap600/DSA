class Solution {
    private boolean checkBalance(int[] cnt){
        int common=0;
        for(int i=0;i<26;i++){
            if(cnt[i]==0) continue;
            if(common==0){
                common=cnt[i];
            }
            else if(cnt[i] != common) return false;

        }
        return true;
    }
    public int longestBalanced(String s) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int[] cnt=new int[26];
            for(int j=i;j<n;j++){
                cnt[s.charAt(j)-'a']++;
                if(checkBalance(cnt))
                    maxlen=Math.max(maxlen,j-i+1);
            }
            
        }
        return maxlen;
    }
}