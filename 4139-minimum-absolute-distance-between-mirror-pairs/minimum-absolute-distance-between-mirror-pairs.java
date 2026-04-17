class Solution {
    private int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            //int rev=reverse(nums[i]);
            if(map.containsKey(nums[i])){
                mini=Math.min(mini,i-map.get(nums[i]));
            }
            map.put(reverse(nums[i]),i);
        }
        return mini==Integer.MAX_VALUE ? -1 : mini;
    }
}