class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int cnt=0;
        long pro=1;

        for(int i=0;i<n;i++){
            pro*=nums[i];

            while(l<=i && pro>=k){
                pro=pro/nums[l];
                l++;
            }
            cnt+=(i-l+1);
        }
        return cnt;
    }
}