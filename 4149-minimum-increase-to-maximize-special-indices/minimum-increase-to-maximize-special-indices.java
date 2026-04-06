class Solution {
    public long minIncrease(int[] nums) {
        int n=nums.length;
        long op1=0,op2=0;
        long[] pref=new long[n];
        for(int i=1;i<n-1;i+=2){
            int max=Math.max(nums[i-1],nums[i+1]);
            if(max>=nums[i]){
                op1+=(long)(max-nums[i])+1;
            }
            pref[i]=op1;
        }
        if(n%2!=0) return op1;
        long mn=op1;
        for(int i=n-2;i>=1;i-=2){
            int max=Math.max(nums[i-1],nums[i+1]);
            if(max>=nums[i]){
                op2+=(long)(max-nums[i]+1);
            }
            if(i-3>=1){
                mn=Math.min(mn,op2+pref[i-3]);
            }
        }
        return Math.min(op2,mn);
    }
}