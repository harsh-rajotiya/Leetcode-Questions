class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int item, int first, int last) {
        int mid = first + (last - first) / 2;
        while (first <= last) {
            if (nums[mid] == item) return mid; else if (nums[mid] > item) return binarySearch(nums, item, first, mid - 1); else return binarySearch(nums, item, mid + 1, last);
        }

        return -1;
    }
}
