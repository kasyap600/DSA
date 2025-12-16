class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        double sum=0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxi=sum;
        for(int end=k;end<n;end++){
            sum+=nums[end];
            sum-=nums[end-k];
            maxi=Math.max(sum,maxi);
        }
        return maxi/k;
    }
}