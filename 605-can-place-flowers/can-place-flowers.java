class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size=flowerbed.length;
        for(int i=0;i<size;i++){
            boolean prev=i==0 || flowerbed[i-1]==0;
            boolean next=i==size-1 || flowerbed[i+1]==0;
            if(prev&& next && flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}