class Solution {

    public int findNumbers(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int digits = 0;
            while (nums[i] > 0) {
                digits++;
                nums[i] /= 10;
            }
            if (digits % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}
