class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                int x=nums[i],y=nums[j];
                if(Math.abs(x-y)<=Math.min(x,y)){
                    maxi=Math.max(maxi,x^y);
                }
            }
        }
        return maxi;
    }
}