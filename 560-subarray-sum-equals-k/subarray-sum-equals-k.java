class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int maxi=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(map.containsKey(sum-k)){
                maxi+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return maxi;
    }
}
// tc O(N)
//sc O(N)