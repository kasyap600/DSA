class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if(map.get(a).equals(map.get(b))) {
                return a.compareTo(b);   // lexicographical
            }
            return map.get(b) - map.get(a); // higher frequency first
        });
        List<String> ls=new ArrayList<>();
        int cnt=0;
        for(int i=0;i<k;i++){
            ls.add(list.get(i));
        }
        return ls;
    }
}