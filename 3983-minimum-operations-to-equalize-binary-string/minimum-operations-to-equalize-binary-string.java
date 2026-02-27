class Solution {
    public int minOperations(String s, int k) {
        int n=s.length();
        int zero=0;
        for(char c:s.toCharArray()){
            if(c=='0') zero++; 
        }
        if(n==k){
            if(zero==0) return 0;
            if(zero==n) return 1;
            return -1; 
        }
        int ans=Integer.MAX_VALUE;
        if(zero%2==0){
            int m=Math.max(cellDiv(zero,k),cellDiv(zero,n-k));
            if(m%2==1) m++;
            ans=Math.min(ans,m);
        }
        if(zero % 2 == k % 2) {
        int M = Math.max(cellDiv(zero,k), cellDiv(n-zero,n-k));
            if(M % 2 == 0) M++;
            ans = Math.min(ans, M);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
    private int cellDiv(int x,int y){
        return (x+y-1)/y;
    }
}