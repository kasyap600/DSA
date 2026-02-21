class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxi=0;
        int zero=0;
        int left=0,right=0;
        while(right<n){
            if(nums[right]==0) zero++;
            if(zero>k){
                if(nums[left++]==0) zero--;
            }
            if(zero<=k){
                int len=right-left+1;
                maxi=Math.max(maxi,len);
            }
            right++;
        }
        return maxi;
    }
}