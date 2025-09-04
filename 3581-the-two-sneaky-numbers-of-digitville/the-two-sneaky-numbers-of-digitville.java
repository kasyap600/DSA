class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n];
        for(int num:nums) hash[num]++;
        int[] ans=new int[2];
        int k=0;
        for(int i=0;i<n;i++){
            if(hash[i]==2) ans[k++]=i;
        }
        return ans;
    }
}