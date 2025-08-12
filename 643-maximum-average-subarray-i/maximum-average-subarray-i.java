class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ans=0;
        if(n<k) return -1;
        if(n==1 && k==1){
            ans=nums[0];
            return ans;
        }
        double maxsum=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum/k;
    }
}