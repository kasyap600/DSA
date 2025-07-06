class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid[0].length;
        int size=n*n;
        int[] hash=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hash[grid[i][j]]++;
            }
        }
        int repeating=-1,missing=-1;
        for(int i=1;i<=size;i++){
            if(hash[i]==2) repeating =i;
            else if(hash[i]==0) missing=i;
            
            if(repeating!=-1 && missing!=-1) break;
        }
        return new int[]{repeating,missing};
    }
}

//TC->O(2N) SC->O(N)