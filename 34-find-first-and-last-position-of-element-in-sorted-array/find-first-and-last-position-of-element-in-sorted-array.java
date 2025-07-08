class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] result={-1,-1};
        result[0]=binarysearch(nums,target,true); 
        result[1]=binarysearch(nums,target,false);      
        return result;
    }
    static int binarysearch(int[] nums,int target,boolean findfirst){
        int s=0,e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>nums[mid]) s=mid+1;
            else if(target<nums[mid]) e=mid-1;
            else{
                ans=mid;
                if(findfirst){
                    e=mid-1;
                }
                else s=mid+1;
            } 
        }
        return ans;
    }


}

//TC->O(logN) SC->O(1)