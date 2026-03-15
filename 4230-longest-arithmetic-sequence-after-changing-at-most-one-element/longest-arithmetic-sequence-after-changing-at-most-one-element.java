class Solution {
    public int longestArithmetic(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = 1;
        pre[1] = 2;

        for (int i = 2; i < n; i++) {
            if ((long) nums[i] - nums[i - 1] == (long) nums[i - 1] - nums[i - 2]) {
                pre[i] = pre[i - 1] + 1;
            } else {
                pre[i] = 2;
            }
        }

        suf[n - 1] = 1;
        suf[n - 2] = 2;

        for (int i = n - 3; i >= 0; i--) {
            if ((long) nums[i + 1] - nums[i] == (long) nums[i + 2] - nums[i + 1]) {
                suf[i] = suf[i + 1] + 1;
            } else {
                suf[i] = 2;
            }
        }

        int ans = 2;

        for (int i = 0; i + 1 < n; i++) {
            long d = (long) nums[i + 1] - nums[i];

            int L = (i >= 1 && (long) nums[i] - nums[i - 1] == d) ? pre[i] : 1;
            int R = (i + 2 < n && (long) nums[i + 2] - nums[i + 1] == d) ? suf[i + 1] : 1;

            ans = Math.max(ans, Math.min(n, L + R + 1));
        }

        for (int i = 0; i + 2 < n; i++) {
            long g = (long) nums[i + 2] - nums[i];
            if (g % 2 != 0) continue;

            long d = g / 2;

            int L = (i >= 1 && (long) nums[i] - nums[i - 1] == d) ? pre[i] : 1;
            int R = (i + 3 < n && (long) nums[i + 3] - nums[i + 2] == d) ? suf[i + 2] : 1;

            ans = Math.max(ans, Math.min(n, L + 1 + R));
        }

        return ans;
    }
}