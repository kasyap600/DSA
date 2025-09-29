class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int m=nums2.length;
        int cnt=0;
        for(int i=0;i<n;i++){
             int num=nums1[i];
            for(int j=0;j<m;j++){

                int div=nums2[j]*k;
                if(num%div==0)cnt++;
            }
        }
        return cnt;
    }
}