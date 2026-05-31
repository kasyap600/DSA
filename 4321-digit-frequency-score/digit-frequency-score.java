class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        String val=String.valueOf(n);
        int[] freq=new int[10];
        for(char c:val.toCharArray()){
            freq[c-'0']++;
        }

        for(int d=0;d<=9;d++){
            sum+=d*freq[d];
        }
        return sum;
    }
}