class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long left=0;
        for(int n:nums){
            left+=n;
        }
        long pro=1;
        for(int i=nums.length-1;i>=0;i--){
            left-=nums[i];
            if(left==pro) return i;
            if(pro>left/nums[i]) break;
            
            pro*=nums[i];
        }
        return -1;
    }
}