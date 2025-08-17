class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){
            int num1=(int)s.charAt(i);
            int num2=(int) s.charAt(i+1);
            sum+=Math.abs(num1-num2);
        }
        return sum;
    }
}