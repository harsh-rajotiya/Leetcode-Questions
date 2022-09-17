class Solution {

    public int binaryGap(int n) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        while (n != 0) {
            int x = n & 1;
            if (x == 1) {
                ans = 1;
                n >>= 1;
                while ((n & 1) == 0) {
                    ans++;
                    n >>= 1;
                    if (n == 0) {
                        return Math.max(0, max);
                    }
                }
            } else {
                n >>= 1;
            }
            max = Math.max(ans, max);
        }
        return max;
    }
}
