class Solution {
    public int findComplement(int num) {
        int ans=0;
        int pow=1;
        while(num>0){
            int bit=num&1;
            if(bit==0){
                ans+=pow;
            }
            pow*=2;
            num/=2;
        }
        return ans;
    }
}