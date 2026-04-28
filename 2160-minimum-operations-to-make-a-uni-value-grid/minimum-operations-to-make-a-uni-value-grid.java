class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int op=0;
        List<Integer> ls=new ArrayList<>();
        for(int[] r:grid){
            for(int num:r){
                ls.add(num);
            }
        }
        int base=ls.get(0);
        for(int num:ls){
            if((num-base)%x!=0) return -1;
        }
        Collections.sort(ls);
        int median=ls.get(ls.size()/2);
        for(int num:ls){
            op+=Math.abs(num-median)/x;
        }
        return op;
    }
}