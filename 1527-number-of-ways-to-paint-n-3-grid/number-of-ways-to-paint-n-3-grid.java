class Solution {
    public int numOfWays(int n) {
        int mod=(int)1e9+7;
        long x=6,y=6;
        for(int i=2;i<=n;i++){
            long dx=(3*x+2*y)%mod;
            long dy=(2*x+2*y)%mod;
            x=dx;
            y=dy;
        }
        return (int)((x+y)%mod);
    }
}