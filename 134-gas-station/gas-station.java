class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totgas=0;
        int totcost=0;
        for(int i=0;i<n;i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }
        if(totgas<totcost) return -1;;
        int currgas=0;
        int start=0;
        for(int i=0;i<n;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                currgas=0;
                start=i+1;
            }
        }
        return start;
    }
}