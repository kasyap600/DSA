class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int dis=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int one=Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        dis=Math.min(dis,one);
                    }
                }
            }
        }
        return dis==Integer.MAX_VALUE ? -1 :dis;
    }
}