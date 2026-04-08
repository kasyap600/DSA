class Solution {
    private int solve(int i,int[] freq,int[] dp){
        if(i>=freq.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int not=solve(i+1,freq,dp);
        int take=i*freq[i] + solve(i+2,freq,dp);
        return dp[i]=Math.max(take,not);
        
    }
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        int maxi=0;
        for(int num:nums){
            maxi=Math.max(maxi,num);
        }
        int[] freq=new int[maxi+1];
        for(int num:nums) freq[num]++;
        int[] dp=new int[maxi+1];
        Arrays.fill(dp,-1);
        return solve(0,freq,dp);
    }
}