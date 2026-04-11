class Solution {
    private int helper(List<Integer> v){
        int mini =Integer.MAX_VALUE;

        for(int i =2; i <v.size();i++) {
            int val = Math.abs(v.get(i) - v.get(i-1)) +
                    Math.abs(v.get(i-1) - v.get(i-2)) +
                    Math.abs(v.get(i) - v.get(i-2));

            mini=Math.min(mini,val);
        }
        return mini;
    }
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map =new HashMap<>();

        for(int i=0; i<nums.length;i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(List<Integer>v:map.values()) {
            if(v.size()>=3) {
                ans=Math.min(ans,helper(v));
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}