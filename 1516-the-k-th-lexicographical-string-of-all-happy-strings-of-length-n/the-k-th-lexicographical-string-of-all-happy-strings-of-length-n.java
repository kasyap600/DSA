class Solution {
    public String getHappyString(int n, int k) {
        int tot=3*(1<<(n-1));
        if(k>tot) return "";
        StringBuilder ans=new StringBuilder();
        char prev='#';
        for(int i=0;i<n;i++){
            for(char ch='a';ch<='c';ch++){
                if(ch==prev) continue;

                int rem=n-i-1;
                int cnt=1<<rem;
                if(k>cnt){
                    k-=cnt;
                }
                else{
                    ans.append(ch);
                    prev=ch;
                    break;
                }
            }
        }
        return ans.toString();
    }
}