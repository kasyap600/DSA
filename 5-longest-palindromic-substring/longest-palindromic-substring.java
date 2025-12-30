class Solution {
    static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int n=s.length();
        String longest="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String substring=s.substring(i,j+1);
                if(isPalindrome(substring) && substring.length() > longest.length()){
                    longest=substring;
                }
            }
        }
        return longest;
    }
}