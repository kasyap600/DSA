class Solution {
    public int countValidSelections(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        int cnt=0,s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            sum-=nums[i];
            if(nums[i]==0){
                if(s==sum){
                    cnt+=2;
                }
                else if(Math.abs(sum-s)==1) cnt++;
            }
        }
        return cnt;
    }
}