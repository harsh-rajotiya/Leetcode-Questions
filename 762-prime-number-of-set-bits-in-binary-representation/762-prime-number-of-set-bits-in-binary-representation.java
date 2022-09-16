class Solution {

    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int bit = Integer.bitCount(i);
            if (isPrime(bit)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
