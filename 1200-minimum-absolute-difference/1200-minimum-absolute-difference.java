class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        //this for loop will find the minimum difference that occurs in the array
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(arr[i + 1] - arr[i], min);
        }

        //this for loop will find the elements whose diff are equal to minimum difference
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
}
