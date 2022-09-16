class Solution {

    public boolean isHappy(int n) {
        Set<Integer> ans = new HashSet<Integer>();
        while (n != 1 && !ans.contains(n)) {
            ans.add(n);
            int sum = 0;
            while (n > 0) {
                sum += Math.pow((n % 10), 2);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
