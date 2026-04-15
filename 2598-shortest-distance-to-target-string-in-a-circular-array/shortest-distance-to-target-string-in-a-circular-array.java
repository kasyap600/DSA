class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int l=startIndex;
        int r=startIndex;
        int step=0;
        while(step<=n/2){
            if(words[l].equals(target) || words[r].equals(target)){
                return step;
            }
            l=(l-1+n)%n;
            r=(r+1)%n;
            step++;
            if(l==r){
                if(words[l].equals(target)) return step;
                break;
            }
        }
        return -1;
    }
}