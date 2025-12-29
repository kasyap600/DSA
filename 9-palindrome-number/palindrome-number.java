class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        if(x<0) return false;
        int res=0;
        while(num!=0){
            int digit=num%10;
            res=res*10+digit;
            num/=10;
        }
        if(res==x) return true;
        return false;
    }
}