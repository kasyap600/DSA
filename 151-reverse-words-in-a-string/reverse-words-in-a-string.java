class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int i=0;
        int start=0,end=0;
        List<String> ans=new ArrayList<>();
        while(i<n){
            while(i<n && s.charAt(i)==' ') i++;
            if(i>=n) break;
            start=i;
            while(i<n && s.charAt(i) != ' ') i++;
            end=i-1;
            String word=s.substring(start,end+1);
            ans.add(word);
        }
        StringBuilder res=new StringBuilder();
        for(int j=ans.size()-1;j>=0;j--){
            res.append(ans.get(j));
            if(j!=0) res.append(' ');
        }
        return res.toString();
    }
}
