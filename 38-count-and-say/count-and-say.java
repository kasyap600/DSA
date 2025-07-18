class Solution {
    String getrle(String s) {
        char c = s.charAt(0);
        int cnt = 1;
        String rle = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            } else {
                rle += Integer.toString(cnt) + c;
                c = s.charAt(i);
                cnt = 1;
            }
        }
        rle += Integer.toString(cnt) + c;
        return rle;
    }
    public String countAndSay(int n) {
        String rle = "1";
        if(n==1) return rle;
        for (int i = 1; i < n; i++) {
            rle = getrle(rle);
        }
        return rle;
    }
}
