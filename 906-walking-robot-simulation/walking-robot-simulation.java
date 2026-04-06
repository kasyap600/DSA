class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set=new HashSet<>();
        for(int[] o:obstacles){
            set.add(o[0] + "," + o[1]);
        } 
        int[][] directions = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
        };
        int x=0,y=0;
        int dir=0;
        int maxi=0;
        for(int c:commands){
            if(c==-1){
                dir=(dir+1)%4;
            }
            else if(c==-2){
                dir=(dir+3)%4;
            }
            else{
                while(c-->0){
                    int nx=x+directions[dir][0];
                    int ny=y+directions[dir][1];
                    if(set.contains(nx+","+ny)) break;
                    x=nx;
                    y=ny;
                    maxi=Math.max(maxi,x*x+y*y);
                }
            }
        }
        return maxi;
    }
}