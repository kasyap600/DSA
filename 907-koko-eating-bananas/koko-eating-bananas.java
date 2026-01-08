class Solution {
    private int helper(int[] nums,int mid){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double) nums[i]/mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int num:piles) maxi=Math.max(maxi,num);
        int low=1,high=maxi;
        int k=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(piles,mid)<=h){
                k=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return k;
    }
}