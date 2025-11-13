class Solution {
    private int solve(int[] nums,boolean first,int target){
        int low=0;
        int res=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
            else{
                res=mid;
                if(first) high=mid-1;
                else low=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        ans[0]=solve(nums,true,target);
        ans[1]=solve(nums,false,target);
        return ans;
    }
}