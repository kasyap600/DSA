class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int mod=(int) 1e9+7;
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            for (int i=l; i<= r;i += k) {
                nums[i] = (int)((nums[i] * 1L * v) % mod);
            }
        }  
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
}