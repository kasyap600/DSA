class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            String st=word1[i];
            s1.append(st);
        }
        for(int i=0;i<word2.length;i++){
            String st1=word2[i];
            s2.append(st1);
        }
        if(s1.toString().equals(s2.toString())) return true;
        return false;
    }
}