class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int score=0;
        int maxi=0;
        int left=0,right=n-1;
        while(left<=right){
            if(tokens[left]<=power){
                power-=tokens[left];
                left++;
                score++;
                maxi=Math.max(maxi,score);
            }
            else if(score>0){
                power+=tokens[right];
                score--;
                right--;
            }
            else break;
            
        }
        return maxi;
    }
}