class Solution {
    private boolean Possible(int[] nums,int day,int k,int m){
        int n=nums.length;
        int cnt=0,days=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=day) cnt++;
            else{
                days+=(cnt/k);
                cnt=0;
            }
        }
        days+=(cnt/k);
        return days>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long val=(long) m*k;
        if(val>n) return -1;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(bloomDay[i],max);
            min=Math.min(bloomDay[i],min);
        }
        int low=min,high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Possible(bloomDay,mid,k,m)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
//TC->O(Nlog(max-min))
//SC->O(1)