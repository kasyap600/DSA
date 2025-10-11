class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0){
            int num=nums[0];
            int idx=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]<num){
                    num=nums[i];
                    idx=i;
                }
            }
            nums[idx]=nums[idx]*multiplier;
        }
        return nums;


    }
}