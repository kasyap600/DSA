class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int target=nums.get(i);
            int res=-1;
            int bit=1;
            while((target & bit) != 0){
                res=target-bit;
                bit<<=1;
            }
            ans[i]=res;
        }
        return ans;
    }
}