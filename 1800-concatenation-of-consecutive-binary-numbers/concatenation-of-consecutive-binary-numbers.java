class Solution {
    public int concatenatedBinary(int n) {
        if(n==1) return n;
        int mod=(int)1e9+7;
        long ans=0;
        for(int i=1;i<=n;i++){
            int len=Integer.toBinaryString(i).length();
            ans=((ans<<len)+i)% mod;
        }
        return (int) ans;
    }   
}