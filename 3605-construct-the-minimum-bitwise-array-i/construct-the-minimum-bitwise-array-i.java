class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int tar=nums.get(i);
            int res=-1;
            int bitmask=1;
            while((tar & bitmask) != 0){
                res=tar-bitmask;
                bitmask<<=1;
            }
            ans[i]=res;
        }
        return ans;
    }
}