class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minLen=Integer.MAX_VALUE;
        int s=0;
        int left=0;

        for(int i=0;i<n;i++){
            s+=nums[i];
            while(s>=target){
                minLen=Math.min(minLen,i-left+1);
                s-=nums[left];
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? 0 : minLen;
    }
}