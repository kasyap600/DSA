class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            if (first[idx] == -1) first[idx] = i;
            last[idx] = i;
        }

        int ans = 0;
        for (int ch = 0; ch < 26; ch++) {
            if (first[ch] != -1 && first[ch] < last[ch]) {
                boolean[] seen = new boolean[26];
                for (int k = first[ch] + 1; k < last[ch]; k++) {
                    seen[s.charAt(k) - 'a'] = true;
                }
                for (int m = 0; m < 26; m++) {
                    if (seen[m]) ans++;
                }
            }
        }
        return ans;
    }
}
