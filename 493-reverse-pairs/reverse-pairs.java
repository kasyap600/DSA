class Solution {
    private int mergeSort(int[] nums,int low,int high){
        if(low>=high) return 0;
        int cnt=0;
        int mid=(low+high)/2;
        cnt+=mergeSort(nums,low,mid);
        cnt+=mergeSort(nums,mid+1,high);
        cnt+=countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
    private int countPairs(int[] nums,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>2L*nums[right]) right++;
            cnt+=(right-(mid+1));

        }
        return cnt;
    }
    private void merge(int[] nums,int low,int mid,int high){
        List<Integer> ls=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]) ls.add(nums[left++]);
            else ls.add(nums[right++]);
        }
        while(left<=mid) ls.add(nums[left++]);
        while(right<=high) ls.add(nums[right++]);
        for(int i=low;i<=high;i++){
            nums[i]=ls.get(i-low);
        }

    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }
}