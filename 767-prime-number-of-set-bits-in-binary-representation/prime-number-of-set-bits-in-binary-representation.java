class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        int primeMask=665772;
        for(int i=left;i<=right;i++){
            int bits=Integer.bitCount(i);
            if(((primeMask >> bits) & 1)==1) cnt++;
        }
        return cnt;
    }
}