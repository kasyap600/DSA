class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod=(int) 12345;
        int n=grid.length;
        int m=grid[0].length;
        int[][] p=new int[n][m];
        int size=n*m;
        int[] arr=new int[size];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++]=grid[i][j];
            }
        }
        int[] pre=new int[size];
        int[] suf=new int[size];
        Arrays.fill(pre,1);
        Arrays.fill(suf,1);

        for(int i=1;i<size;i++){
            pre[i]=(int)((1L * pre[i-1] * arr[i-1])%mod);
        }
        for(int i=size-2;i>=0;i--){
            suf[i]=(int) ((1L * arr[i+1] * suf[i+1])%mod);
        }
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            ans[i]=(int)((1L * pre[i] * suf[i])%mod);
        }
        idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                p[i][j]=ans[idx++];
            }
        }
        return p;

    }
}