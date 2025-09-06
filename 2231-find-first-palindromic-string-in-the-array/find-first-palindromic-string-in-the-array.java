class Solution {
    private boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(String word:words){
            boolean flag=isPalindrome(word,0,word.length()-1);
            if(flag) return word;
        }
        return "";
    }
}