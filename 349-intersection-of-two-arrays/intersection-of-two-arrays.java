class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n2=nums2.length;
        int size=Math.min(n1,n2);
        int[] ans=new int[size];
        int i=0,j=0,cnt=0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
            
                if (cnt == 0 || ans[cnt - 1] != nums1[i]) {
                    ans[cnt++] = nums1[i];
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return Arrays.copyOf(ans,cnt);
    }
}