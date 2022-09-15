class Solution {

    public int singleNumber(int[] nums) {
        //XOR every element with each other, same elements will cancel out and one single element will be left

        int result = 0;

        for (int x : nums) {
            result ^= x;
        }

        return result;
    }
}
