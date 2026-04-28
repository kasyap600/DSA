import java.util.*;

class Solution {
    public int[] kthRemainingInteger(int[] nums, int[][] queries) {
        List<Integer> evenVals = new ArrayList<>();
        List<Integer> evenIdx = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenVals.add(nums[i]);
                evenIdx.add(i);
            }
        }
        int[] ans = new int[queries.length];
        int qi = 0;
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2];
            int left = lowerBound(evenIdx, l);
            int right = upperBound(evenIdx, r) - 1;
            long low = 2, high = (long)2 * (k + (right - left + 1)) + 10;
            long res = -1;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                if ((mid & 1) == 1) mid--;
                long totalEven = mid / 2;
                int removed = 0;
                if (left <= right) {
                    removed = upperBoundRange(evenVals, left, right, (int) mid);
                }
                long remaining = totalEven - removed;
                if (remaining >= k) {
                    res = mid;
                    high = mid - 2;
                } else {
                    low = mid + 2;
                }
            }
            ans[qi++] = (int) res;
        }
        return ans;
    }

    private int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) <= target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBoundRange(List<Integer> list, int l, int r, int val) {
        int low = l, high = r + 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= val) low = mid + 1;
            else high = mid;
        }
        return low - l;
    }
}