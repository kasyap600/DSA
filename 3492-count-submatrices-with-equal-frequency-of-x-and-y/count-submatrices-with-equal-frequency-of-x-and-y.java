class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] sumX=new int[m];
        int[] sumY=new int[m];
        int cnt=0;
        for(int i=0;i<n;i++){
            int x=0,y=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]=='X') x++;
                else if(grid[i][j]=='Y') y++;
                sumX[j]+=x;
                sumY[j]+=y;
                if(sumX[j]>0 && sumX[j]==sumY[j]) cnt++;
              
            }
        }
        return cnt;


    }
}