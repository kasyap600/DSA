class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int cnt=0;
        int prefix=0;
        for(int i=0;i<n-1;i++){
            prefix+=nums[i];
            if((2*prefix-total) % 2==0){
                cnt++;
            }
        }
        return cnt;
    }
}