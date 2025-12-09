class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c=s.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<right){
            while(left<right && !Character.isLetter(c[left])) left++;
            while(left<right && !Character.isLetter(c[right])) right--;
            if(left<right){
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}