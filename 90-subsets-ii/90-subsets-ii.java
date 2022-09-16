class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> current = new ArrayList<Integer>();
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        findSubset(nums, 0, current, result);
        return new ArrayList(result);
    }

    public void findSubset(int[] nums, int i, List<Integer> current, Set<List<Integer>> result) {
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
