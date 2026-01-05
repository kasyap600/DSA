class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int pro=0;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p*=nums[j];
                if(p>pro) pro=p;
            }
        }
        return pro;
    }
}