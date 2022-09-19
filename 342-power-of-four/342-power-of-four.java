class Solution {

    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        if (num % 4 == 0) return isPowerOfFour(num / 4);
        if (num == 1) return true;
        return false;
    }
}
