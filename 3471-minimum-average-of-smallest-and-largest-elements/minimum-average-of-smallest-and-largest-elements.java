class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        int times=n/2;
        double avg=Double.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            double val=(nums[i]+nums[n-i-1])/2.0;
            avg=Math.min(avg,val);
        }
        return avg;
    }
}