class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            arr.add(nums1[i]);
        }
        HashSet<Integer> ans = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (arr.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for (Integer j : ans) {
            result[i++] = j;
        }
        return result;
    }
}
