class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int idx=0;
        int i=1;
        while(i<n){
            if(nums[i]!=nums[idx]){
                idx++;
                nums[idx]=nums[i];
            }
            i++;
        }
        return idx+1;
    }
}