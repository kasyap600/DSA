class Solution {
    public int maxBalancedShipments(int[] weight) {
        int cnt=0;
        int  i=0;
        int n=weight.length;
        while(i<n-1){
            if(weight[i]>weight[i+1]){
                cnt++;
                i+=2;
                continue;
            }
            i++;
        }
        return cnt;
    }
}