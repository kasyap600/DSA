class Solution {
    private boolean bs(int[] nums,int tar){
        int n=nums.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<tar) low=mid+1;
            else if(nums[mid]>tar) high=mid-1;
            else return true;
        }
        return false;
    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans=new int[2];
        int totAlice=0;
        int totBob=0;
        for(int num:aliceSizes) totAlice+=num;
        for(int num:bobSizes) totBob+=num;
        Arrays.sort(bobSizes);
        int n=aliceSizes.length;
        int m=bobSizes.length;
        for(int i=0;i<n;i++){
            int target=(totBob + 2 * aliceSizes[i]-totAlice)/2;
            if(bs(bobSizes,target)){
                return new int[]{aliceSizes[i],target};
            }
            
        }
        return new int[0];
    }
}