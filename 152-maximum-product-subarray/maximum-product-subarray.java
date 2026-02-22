class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int pro=1;
        int pre=1;
        int suf=1;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(suf==0) suf=1;
            if(pre==0) pre=1;
            pre*=nums[i];
            suf*=nums[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,suf));
        }
        
        return maxi;

    }
}