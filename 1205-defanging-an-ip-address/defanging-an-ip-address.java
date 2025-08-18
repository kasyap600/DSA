class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str=new StringBuilder();
        int n=address.length();
        for(int i=0;i<n;i++){
            char c=address.charAt(i);

            if(c=='.'){
                str.append("[.]");
            }
            else str.append(c);
            
        }
        
        return str.toString();
    }
}