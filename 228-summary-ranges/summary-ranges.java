class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        while (r < nums.length) {
            if (l == r) {
                sb.append(nums[l]);
                r++;
            } else if (nums[l] + 1 == nums[r]) {
                // sb.append("->"+nums[r]);
                l++;
                r++;
                found = true;
            } else {
                if (found) {
                    sb.append("->" + nums[l]);
                    found = false;
                }
                ret.add(sb.toString());
                l = r;
                sb.setLength(0);
            }
        }
        if (found) {
            sb.append("->" + nums[l]);
            found = false;
        }
        if (sb.length() > 0) {
            ret.add(sb.toString());
        }
        return ret;
    }
}