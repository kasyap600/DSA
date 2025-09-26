class Solution {
    private int helper(int[] nums,int k){
        if(k<0) return 0;
        int n=nums.length;
        int sum=0;
        int l=0,r=0,cnt=0;
        while(r<n){
            sum+=(nums[r]%2==0)?0:1;
            while(sum>k){
                sum-=(nums[l]%2==0)? 0:1;
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}