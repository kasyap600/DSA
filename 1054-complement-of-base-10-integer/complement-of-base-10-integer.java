class Solution {
    public int bitwiseComplement(int n) {
        int mask=1;
        if(n==0) return mask;
        while(mask<=n){
            mask=mask<<1;
        }
        mask=mask-1;
        int comp=mask^n;
        return comp;

    }
}