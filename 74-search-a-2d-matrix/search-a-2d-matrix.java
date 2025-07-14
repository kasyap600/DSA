class Solution {
    private boolean binarySearch(int[] nums,int target){
        int n=nums.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            flag=binarySearch(matrix[i],target);
            if(flag==true) break;
        }
        return flag;
    }
}