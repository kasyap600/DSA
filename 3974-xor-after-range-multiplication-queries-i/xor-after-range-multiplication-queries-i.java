class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;
        int mod=(int) 1e9+7;
        for(int i=0;i<m;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int v=queries[i][3];
            int k=queries[i][2];
            int idx=l;
            while(idx<=r){
                nums[idx]=(int) ((nums[idx] *1L* v) %mod);
                idx+=k;
            }
        }
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
}