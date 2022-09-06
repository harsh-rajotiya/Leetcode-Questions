class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bCandy = new HashSet();
        int[] ans = new int[2];
        int a = 0; // a is alice's candies
        int b = 0; // b is bob's candies

        for (int x : aliceSizes) {
            a += x;
        }
        for (int x : bobSizes) {
            b += x;
            bCandy.add(x);
        }
        int diff = (b - a) / 2; //diff b/w both's candies
        for (int x : aliceSizes) {
            if (bCandy.contains(x + diff)) {
                ans[0] = x;
                ans[1] = x + diff;
            }
        }
        return ans;
    }
}
