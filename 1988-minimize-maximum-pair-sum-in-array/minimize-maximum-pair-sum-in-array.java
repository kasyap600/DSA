class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int maxi=0;
        for(int i=0;i<n/2;i++){
            maxi=Math.max(maxi,nums[i]+nums[n-i-1]);
        }
        return maxi;
    }
}