class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int cnt=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>0) high=mid-1;
            else low=mid+1;
        }
        int pos=n-low;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<0) low=mid+1;
            else high=mid-1;
        }
        int neg=high+1;
        return Math.max(pos,neg);

    }
}