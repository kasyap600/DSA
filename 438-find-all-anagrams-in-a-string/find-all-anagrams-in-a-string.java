class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()) return ans;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            ans.add(0);
        }
        int start=0;
        int end=p.length();
        while(end<s.length()){
            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;

            if(Arrays.equals(freq1,freq2)) ans.add(start+1);

            end++;
            start++;
        }
        return ans;

    }
}