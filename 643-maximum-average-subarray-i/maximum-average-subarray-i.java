class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ans=0;
        for(int i=0;i<k;i++) ans+=nums[i];
        double maxi=ans;
        for(int i=k;i<n;i++){
            ans+=nums[i];
            ans-=nums[i-k];
            maxi=Math.max(ans,maxi);
        }
        return maxi/k;

    }
}