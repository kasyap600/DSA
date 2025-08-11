class Solution {
    public int countPairs(int[] deliciousness) {
        Map<Integer,Integer> map=new HashMap<>();
        int mod=(int) 1e9+7;
        int n=deliciousness.length;
        long res=0;
        for(int num:deliciousness){
            int power=1;
            for(int i=0;i<22;i++){
                if(map.containsKey(power-num)){
                    res+=map.get(power-num);
                    res%=mod;
                }
                power*=2;
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return (int)res;
    }
}