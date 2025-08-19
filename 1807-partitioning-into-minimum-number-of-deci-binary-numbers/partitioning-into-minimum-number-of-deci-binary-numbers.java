class Solution {
    public int minPartitions(String n) {
        int len=n.length();
        int ans=0;
        for(int i=0;i<len;i++){
            if(n.charAt(i) - '0' ==9) return 9;
            ans=Math.max(ans,(n.charAt(i) - '0'));
        }
        return ans;
    }
}