class Solution {
    private boolean func(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0,right=n-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return func(s,left+1,right) || func(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}