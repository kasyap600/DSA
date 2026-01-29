class Solution {
    public int twoEggDrop(int n) {
        int total=0;
        int drop=0;
        while(total<n){
            drop++;
            total+=drop;
        }
        return drop;
    }
}