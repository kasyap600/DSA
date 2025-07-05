class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt=0;
                
            } 
            else cnt++;
            if(max<cnt) max=cnt;
        }
        return max;
    }
}

//TC->O(N) SC->O(1)