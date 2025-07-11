class Solution {
    private int Sum(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double) nums[i]/mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
        }
        int low=1,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(Sum(nums,mid)<=threshold) high=mid-1;
            else low=mid+1;
        }
        return low;
        
    }
}
//TC->O(log(max)*N) 
//SC->O(1)