class Solution {
    public String maximumOddBinaryNumber(String s) {
        // 8 4 2 1 
        int n=s.length();
        int ones=0;
        int zero=0;
        for(char c:s.toCharArray()){
            if(c=='1') ones++;
            else zero++;
        }
        StringBuilder res=new StringBuilder();
        res.append("1".repeat(ones-1));
        res.append("0".repeat(zero));
        res.append("1");
        return res.toString();
    }
}