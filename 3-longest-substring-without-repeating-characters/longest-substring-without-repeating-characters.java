class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0,max=0;
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[s.charAt(r)] != -1) l=Math.max(hash[s.charAt(r)]+1,l);
            int len=r-l+1;
            max=Math.max(len,max);
            hash[s.charAt(r)]=r;
            r++;
        }
        return max;
    }
}

//TC->O(N) & SC->O(256)