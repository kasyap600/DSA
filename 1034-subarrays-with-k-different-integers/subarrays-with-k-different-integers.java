class Solution {
    private int atMost(int[] nums,int k){
        int n=nums.length;
        int l=0,r=0;
        int maxi=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            maxi+=r-l+1;
            r++;
        }
        return maxi;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}