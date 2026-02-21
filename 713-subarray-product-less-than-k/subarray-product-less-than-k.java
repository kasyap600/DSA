class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int pro=1;
        int cnt=0;
        int l=0,r=0;
        while(r<n){
            pro*=nums[r];
            while(l<=r &&pro>=k){
                pro=pro/nums[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}