class Solution {

    public int maximumProduct(int[] nums) {
        //we can either take product of last 3 numbers(because in sorted array they will be maximum) or we can take product of first two numbers and last number(as there can be negative numbers present) so if first two are negative then their product will give positive which then multiplied by last number will give us maximum product.

        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}
