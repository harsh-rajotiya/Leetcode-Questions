class Solution {

    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        // find `log4(n)`
        double i = Math.log(n) / Math.log(4);

        // return true if `log4(n)` is an integer
        return i == Math.floor(i);
    }
}
