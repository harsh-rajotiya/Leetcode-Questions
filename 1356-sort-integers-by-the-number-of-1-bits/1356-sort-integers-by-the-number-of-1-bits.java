class Solution {

    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (Integer.bitCount(arr[j - 1]) > Integer.bitCount(arr[j])) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
