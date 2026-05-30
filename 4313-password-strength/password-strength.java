class Solution {
    public int passwordStrength(String password) {
        int ans=0;
        Set<Character> set=new HashSet<>();
        for(char c:password.toCharArray()){
            set.add(c);
        }
        for(char c:set){
            if(c>='a' && c<='z') ans+=1;
            else if(c>='A' && c<='Z') ans+=2;
            else if(c>='0' && c<='9') ans+=3;
            else ans+=5;
        }
        return ans;
    }
}