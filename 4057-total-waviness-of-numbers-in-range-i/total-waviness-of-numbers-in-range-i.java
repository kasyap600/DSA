class Solution {
    private int solve(int num){
        String val=String.valueOf(num);
        int n=val.length();
        int cnt=0;
        if(n<3) return 0;
        for(int i=1;i<n-1;i++){
            char left=val.charAt(i-1);
            char cur=val.charAt(i);
            char right=val.charAt(i+1);
            if((cur>left && cur>right) || (cur<left && cur<right)) cnt++;
        }
        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int sum=0;
        for(int i=num1;i<=num2;i++){
            int digit=solve(i);
            sum+=digit;
        }
        return sum;
    }
}