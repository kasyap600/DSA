class Solution {
    public int residuePrefixes(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int cnt=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<n;i++){
            set.add(ch[i]);
            int uniq=set.size();
            if(uniq==(i+1)%3) cnt++;
        }
        return cnt;
    }
}