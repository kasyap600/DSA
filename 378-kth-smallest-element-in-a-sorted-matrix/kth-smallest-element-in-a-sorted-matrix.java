class Solution {
    private int cntLess(int[][] nums,int mid){
        int n=nums.length;
        int row=n-1;
        int cnt=0;
        int col=0;
        while(row>=0 && col<n){
            if(nums[row][col]<=mid){
                cnt+=row+1;
                col++;
            }
            else row--;
        }
        return cnt;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(cntLess(matrix,mid)>=k){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}