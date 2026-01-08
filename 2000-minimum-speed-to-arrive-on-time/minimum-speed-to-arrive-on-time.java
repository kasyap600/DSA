class Solution {
    private double helper(int[] nums,int mid){
        int n=nums.length;
        double s=0.0;
        for(int i=0;i<n-1;i++){
            s+=Math.ceil((double)nums[i]/mid);
        }
        s+=(double)nums[n-1]/mid;
        return s;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int maxi=Integer.MIN_VALUE;
        int n=dist.length;
        if(hour<=n-1) return -1;
        for(int num:dist) maxi=Math.max(num,maxi);
        int low=1,high=10000000;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(dist,mid)<=hour){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;

    }
}