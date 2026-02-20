class Solution {
    private boolean helper(int[] time,int total,long mid){
        int n=time.length;
        long sum=0;
        for(int t:time){
            sum+=mid/t;
            if(sum>=total) return true;
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int n=time.length;
        if(n==1) return (long)time[0]*totalTrips;
        long low=1;
        long min=Long.MAX_VALUE;
        for(int t:time){
            min=Math.min(t,min);
        }
        long high=min * totalTrips;
        long ans=high;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(helper(time,totalTrips,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}