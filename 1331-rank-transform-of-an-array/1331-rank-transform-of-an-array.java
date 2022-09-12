class Solution {

    public int[] arrayRankTransform(int[] arr) {
        int[] b = new int[arr.length];
        int j = 0;

        for (int x : arr) {
            b[j++] = x;
        }

        Arrays.sort(b);

        Map<Integer, Integer> ans = new HashMap<>();
        for (int c : b) {
            if (!ans.containsKey(c)) {
                ans.put(c, ans.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(arr[i]);
        }

        return arr;
    }
}
