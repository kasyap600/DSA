class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int arr_sum=0;
        for(int num:nums){
            arr_sum+=num;

        }
        return sum-arr_sum;

    }
}

//TC->O(N) SC->O(1)