class Solution {

    public int[] sortArrayByParityII(int[] nums) {
        //using pointers
        int i = 0;
        int j = 1;
        int n = nums.length;

        while (i < n && j < n) {
            if (i < n && nums[i] % 2 == 0) {
                i += 2;
            }
            if (j < n && nums[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
