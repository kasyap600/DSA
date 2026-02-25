class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> ls=new ArrayList<>(map.keySet());
        Collections.sort(ls,(a,b)-> map.get(b)-map.get(a));
        StringBuilder str=new StringBuilder();
        for(char c:ls){
            int freq=map.get(c);
            while(freq>0){
                str.append(c);
                freq--;
            }
        }
        return str.toString();
     
    }
}