class Solution {
    static class Pair{
        String word;
        int steps;
        Pair(String word,int steps){
            this.word=word;
            this.steps=steps;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st=new HashSet<>(wordList);
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().word;
            int steps=q.peek().steps;
            q.poll();
            if(word.equals(endWord)) return steps;
            for(int i=0;i<word.length();i++){
                char[] wordarr=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    wordarr[i]=ch;
                    String str=new String(wordarr);
                    if(st.contains(str)){
                        st.remove(str);
                        q.add(new Pair(str,steps+1));
                    }

                    
                }
            }
        }
        return 0;
    }
}