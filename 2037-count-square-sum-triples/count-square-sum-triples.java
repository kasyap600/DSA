class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int ab=i*i+j*j;
                int c=(int) Math.sqrt(ab);
                if(c*c==ab && c<=n) cnt++;
            }
        }
        return cnt;
    }
}