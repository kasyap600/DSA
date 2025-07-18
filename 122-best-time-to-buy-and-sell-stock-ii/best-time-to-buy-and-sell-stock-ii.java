class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int start=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
           if(start<prices[i]) max+=prices[i]-start;
           start=prices[i];
        }
        return max;
    }
}