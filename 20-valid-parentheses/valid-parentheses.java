class Solution {
    private boolean isMatched(char open,char close){
        if((open=='(' && close==')') || 
           (open=='{' && close=='}') ||
            (open=='[' && close==']')) return true;
        return false;
    }
    public boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                st.push(str.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if(!isMatched(ch,str.charAt(i))) return false;
            }
        }
        return st.isEmpty();
    }
}