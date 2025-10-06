class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int[] ans =new int[n];
        ans[0]=pref[0];
        int k=1;
        if(n==1) return ans;
        for(int i=1;i<n;i++){
            ans[i]=pref[i]^pref[i-1];
        }
        return ans;
    }
}