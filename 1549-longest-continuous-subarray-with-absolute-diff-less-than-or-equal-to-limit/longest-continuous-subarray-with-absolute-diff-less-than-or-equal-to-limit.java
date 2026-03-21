class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        Deque<Integer> maxi=new ArrayDeque<>();
        Deque<Integer> mini=new ArrayDeque<>();
        int l=0;
        int ans=0;
        for(int r=0;r<n;r++){
            while(!maxi.isEmpty() && nums[r]>maxi.peekLast()){
                maxi.pollLast();
            }
            maxi.addLast(nums[r]);
            while(!mini.isEmpty() && nums[r]< mini.peekLast()){
                mini.pollLast();
            }
            mini.addLast(nums[r]);
            while(maxi.peekFirst() - mini.peekFirst() > limit){
                if(nums[l] == maxi.peekFirst() ) maxi.pollFirst();
                if(nums[l]== mini.peekFirst()) mini.pollFirst();
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;

    }
}