class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long maxi=0;
        long sum=0;
        int l=0,r=0;
        Set<Integer> set=new HashSet<>();
        while(r<n){
            sum+=nums[r];
            while(set.contains(nums[r])){
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            if(r-l+1==k){
                maxi=Math.max(maxi,sum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            r++;
        }
        return maxi;
    }
}