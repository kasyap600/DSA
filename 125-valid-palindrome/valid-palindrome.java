class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       s = s.replaceAll("[^a-zA-Z0-9]", "");
       int n=s.length();
       int left=0,right=n-1;
       while(left<=right){
        if(s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
       }
       return true;

    }
}