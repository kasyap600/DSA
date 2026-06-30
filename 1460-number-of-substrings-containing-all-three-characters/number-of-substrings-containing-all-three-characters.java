class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        int n=s.length();
        int[] ans=new int[3];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            ans[s.charAt(i)-'a']=i;
            cnt+=1+Math.min(ans[0],Math.min(ans[1],ans[2]));
        }
        return cnt;
    }
}