class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map=new HashMap<>();
        for(char t:tasks){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int maxfreq=0;
        for(int freq:map.values()){
            maxfreq=Math.max(freq,maxfreq);
        }
        int cnt=0;
        for(int freq:map.values()){
            if(freq==maxfreq) cnt++;
        }
        int interval=(maxfreq-1)*(n+1) + cnt;
        return Math.max(tasks.length,interval);
    }
}