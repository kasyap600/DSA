class Solution {
    public long countSubarrays(int[] nums, int k, int m) {
        long ans=0;
        int leftd=0,leftm=0;
        int vcount=0;
        Map<Integer,Integer> freqd=new HashMap<>();
        Map<Integer,Integer> freqv=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            int curr=nums[r];
            // distinct element window k
            freqd.put(curr,freqd.getOrDefault(curr,0)+1);
            while(freqd.size()>k){
                int temp=nums[leftd];
                int c=freqd.get(temp);
                if(c==1) freqd.remove(temp);
                else freqd.put(temp,c-1);
                leftd++;
            }
            // At least m occurrences case
            int freq=freqv.getOrDefault(curr,0)+1;
            freqv.put(curr,freq);
            if(freq==m) vcount++;
            while(vcount>=k){
                int y=nums[leftm];
                int cy=freqv.get(y);
                if(cy==m) vcount--;
                if(cy==1) freqv.remove(y);
                else freqv.put(y,cy-1);
                leftm++;
            }
            if(leftm>leftd) ans+=(leftm-leftd);
        }
        return ans;
    }
}