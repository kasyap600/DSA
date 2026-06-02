class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int p:prices){
            if(p<buy) buy=p;
            profit=Math.max(profit,p-buy);
        }
        return profit;
    }
}