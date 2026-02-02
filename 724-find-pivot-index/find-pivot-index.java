class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        if(n==0) return -1;
        int lsum=0;
        int rsum=0;
        for(int num:nums) rsum+=num;
        for(int i=0;i<n;i++){
            rsum-=nums[i];
            if(lsum==rsum) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}