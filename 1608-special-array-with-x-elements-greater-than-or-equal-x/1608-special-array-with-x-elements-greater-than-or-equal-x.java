class Solution {

    public int specialArray(int[] nums) {
        int[] arr = new int[1001];
        for (int i : nums) {
            arr[i]++;
        }
        int total = nums.length;
        for (int i = 0; i < 1001; i++) {
            if (i == total) {
                return i;
            }
            total = total - arr[i];
        }
        return -1;
    }
}
