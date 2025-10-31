class Solution {
    public int mySqrt(int x) {
         int low=1,high=x;
         while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid<=x) low=(int)mid+1;
            else high=(int)mid-1;
         }
        return high;
    }
}
//TC->O(logN) 
//SC->O(1)