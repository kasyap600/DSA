class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        if(k==1) return 0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            int diff=nums[i+k-1]-nums[i];
            mini=Math.min(mini,diff);
        }
        return mini;
    }
}