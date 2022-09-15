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
        if (n <= 1) return false;
        if (n <= 3) return true;

        int temp = 0;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                temp += 1;
            }
        }
        if (temp > 0) {
            return false;
        } else {
            return true;
        }
    }
}
