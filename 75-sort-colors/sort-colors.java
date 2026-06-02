class Solution {
    public void sortColors(int[] nums) {
        int ones=0;
        int zeros=0;
        for(int num:nums){
            if(num==0) zeros++;
            else if(num==1) ones++;;
        }
        for(int i=0;i<zeros;i++){
            nums[i]=0;
        }
        for(int i=zeros;i<ones+zeros;i++){
            nums[i]=1;
        }
        for(int i=ones+zeros;i<nums.length;i++){
            nums[i]=2;
        }
    }
}