class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int cnt=0;
        int[] freq={0,0,0};
        for(char c:moves.toCharArray()){
            if(c=='L') freq[0]++;
            else if(c=='R') freq[1]++;
            else freq[2]++;
        }
        int dist=Math.abs(freq[0]-freq[1])+freq[2];
        return dist;

    }
}