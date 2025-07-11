class Solution {
    private int Totalhours(int[] nums,int mid){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max) max=piles[i];
        }
        int low=1,high=max;
        int k=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(Totalhours(piles,mid)<=h){
                k=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return k;
    }
}
//TC->O(N*log(max))
//SC->O(1)