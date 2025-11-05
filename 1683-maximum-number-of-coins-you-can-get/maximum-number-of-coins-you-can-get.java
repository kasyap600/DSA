class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        int maxi=0;
        for(int i:piles){
            if(maxi<i) maxi=i;
        }
        int[] freq=new int[maxi+1];
        for(int pile:piles){
            freq[pile]++;
        }
        int coins=0;
        int chance=n/3;
        int turn=1;
        int i=maxi;
        while(chance!=0){
            if(freq[i]>0){
                if(turn==1) turn=0;
                else{
                    chance--;
                    turn=1;
                    coins+=i;
                }
                freq[i]--;
            }
            else i--;
        }
        return coins;
    }
}