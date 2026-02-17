class Solution {
    private int findPossible(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double) nums[i]/ mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1,high=0;
        for(int p:piles){
            high=Math.max(high,p);
        }
        int maxi=Integer.MIN_VALUE;
        int k=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(findPossible(piles,mid)<=h){
                k=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return k;
    }
}