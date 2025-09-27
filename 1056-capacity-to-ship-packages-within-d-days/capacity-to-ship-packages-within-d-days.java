class Solution {
    private int func(int[] weights,int cap){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }

        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int w:weights){
            max=Math.max(max,w);
            sum+=w;
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int noofdays=func(weights,mid);
            if(noofdays<=days){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}