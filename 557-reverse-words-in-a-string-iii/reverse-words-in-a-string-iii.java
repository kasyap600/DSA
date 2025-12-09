class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        StringBuilder reversed=new StringBuilder();
        for(String word:words){
            StringBuilder rev=new StringBuilder(word);
            rev.reverse();
            reversed.append(rev).append(" ");
        }
        return reversed.toString().trim();
    }
}