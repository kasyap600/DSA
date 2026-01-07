class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int n1=s1.length();
        int n2=s2.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<n1;i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);

        }
        if(map1.equals(map2)) return true;
        int l=0;
        for(int r=n1;r<n2;r++){
            char right=s2.charAt(r);
            map2.put(right,map2.getOrDefault(right,0)+1);

            char left=s2.charAt(l);
            map2.put(left,map2.get(left)-1);
            if(map2.get(left)==0) map2.remove(left);
            l++;

            if(map1.equals(map2)) return true;

            

        }
        return false;
    }
}