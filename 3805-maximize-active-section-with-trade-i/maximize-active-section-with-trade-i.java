class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        s = "1" + s + "1";

        int ones = 0;
        int maxMerge = 0;
        int prevZero = Integer.MIN_VALUE;

        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int len = j - i;

            if (s.charAt(i) == '1') {
                ones += len;
            } else {
                maxMerge = Math.max(maxMerge, prevZero + len);
                prevZero = len;
            }

            i = j;
        }

     
        return ones - 2 + maxMerge;
    }
}