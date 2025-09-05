class Solution {
    private int func(int[] nums){
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=0;i<n;i++){
            int pick=nums[i];
            if(i>1) pick+=prev2;
            int notpick=prev;
            int curr=Math.max(pick,notpick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        for(int i=0;i<n;i++){
            if(i!=n-1) temp1[i]=nums[i];
            if(i!=0) temp2[i-1]=nums[i];
        }
        int ans=func(temp1);
        int ans2=func(temp2);
        return Math.max(ans,ans2);
    }
}