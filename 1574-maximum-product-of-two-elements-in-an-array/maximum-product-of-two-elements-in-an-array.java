class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int smax=0;
        for(int num:nums){
            if(num>max){
                smax=max;
                max=num;
            }
            else if(num>smax){
                smax=num;
            }
        }
        return (smax-1)*(max-1);
    }
}