class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num%2==0){
                nums[i]=0;
            }
            else nums[i]=1;

        }
        Arrays.sort(nums);
        return nums;
    }
}