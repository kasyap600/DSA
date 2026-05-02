class Solution {
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(isGood(i)) cnt++;
        }
        return cnt;
    }
    private boolean isGood(int n){
        boolean flag=false;
        while(n>0){
            int digit=n%10;
            // Invalid
            if(digit==3 || digit==4 || digit==7){
                return false;
            }
            //That change
            if(digit==2 || digit==5 || digit==6 || digit==9){
                flag=true;
            }
            n/=10;
        }
        return flag;
    }
}