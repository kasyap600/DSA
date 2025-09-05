class Solution {
    private int func(int[] nums){
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1) pick+=dp[i-2];
            int notpick=0+dp[i-1];

            dp[i]=Math.max(pick,notpick);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        return func(nums);
    }
}