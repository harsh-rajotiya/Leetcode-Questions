class Solution {

    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    public int helper(int[] nums, int level, int XOR) {
        if (level == nums.length) return XOR;

        int inc = helper(nums, level + 1, XOR ^ nums[level]);
        int exc = helper(nums, level + 1, XOR);

        return inc + exc;
    }
}
