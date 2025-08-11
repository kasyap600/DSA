class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        int n=nums.length;
        int[] cnt=new int[51];
        for(int num:nums){
            cnt[num]++;
        }
        for(int i=0;i<=50;i++){
            if(cnt[i]==2){
                xor^=i;
            }
        }
        return xor;
    }
}