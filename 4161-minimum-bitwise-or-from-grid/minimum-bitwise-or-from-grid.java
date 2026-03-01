class Solution {
    private boolean isPossible(int[][] grid,int mask){
        for(int[] row:grid){
            boolean found=false;
            for(int num:row){
                if( (num | mask)==mask){
                    found= true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
    public int minimumOR(int[][] grid) {
        int ans= (1<<17) -1;
        for(int bit=16;bit>=0;bit--){
            int mask=ans & ~(1<<bit);
            if(isPossible(grid,mask)){
                ans=mask;
            }
        }
        return ans;
    }
}