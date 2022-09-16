class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<>();

        findSubset(nums, 0, current, result);
        return result;
    }

    public void findSubset(int[] nums, int i, List<Integer> current, List<List<Integer>> result) {
        if (i == nums.length) {
            result.add(new ArrayList<Integer>(current));
            return;
        }

        current.add(nums[i]);
        findSubset(nums, i + 1, current, result);
        current.remove(current.size() - 1);
        findSubset(nums, i + 1, current, result);
    }
}
