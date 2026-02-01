class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0;
        int r=0;
        int maxi=0;
        int n=s.length();
        while(r<n){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxi=Math.max(maxi,set.size());
            r++;
        }
        return maxi;
    }
}