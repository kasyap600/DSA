class Solution {
    public int balancedStringSplit(String s) {
        int bal=0;
        int cnt=0;
        for(char c:s.toCharArray()){
            switch(c){
                case 'L' : bal++; break;
                case 'R' : bal--; break;
            }
            if(bal==0) cnt++;
        }
        return cnt;
    }
}