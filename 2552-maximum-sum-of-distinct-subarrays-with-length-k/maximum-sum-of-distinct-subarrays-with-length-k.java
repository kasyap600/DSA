class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        long maxi=0,sum=0;
        int left=0;
        for(int i=0;i<n;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            if(i-left+1==k){
                maxi=Math.max(sum,maxi);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return maxi;
    }
}