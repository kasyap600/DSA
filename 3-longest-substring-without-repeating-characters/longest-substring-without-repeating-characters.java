class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=0;
        int start=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;                
            }
            set.add(s.charAt(i));
            maxi=Math.max(maxi,set.size());
        }
        return maxi;
    }
}