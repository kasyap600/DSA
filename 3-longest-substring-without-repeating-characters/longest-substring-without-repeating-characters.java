class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0;
        int maxi=0;
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[s.charAt(r)] != -1) l=Math.max(hash[s.charAt(r)]+1,l);
            int len=r-l+1;
            maxi=Math.max(len,maxi);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxi;
    }
}