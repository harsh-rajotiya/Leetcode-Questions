class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; //index of last element of nums1(in given example it is index of 3)
        int p2 = n - 1; //index of last element of nums2
        int last = m + n - 1; //index of last element of nums1(in given example it is index of 0)
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[last] = nums1[p1];
                last--;
                p1--;
            } else {
                nums1[last] = nums2[p2];
                last--;
                p2--;
            }
        }
    }
}
