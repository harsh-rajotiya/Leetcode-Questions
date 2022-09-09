class Solution {

    public boolean canBeEqual(int[] target, int[] arr) {
        //optimized approach: just like checking for anagrams

        int[] ans = new int[1001];

        for (int i = 0; i < target.length; i++) {
            ans[target[i]]++;
            ans[arr[i]]--;
        }

        for (int i = 1; i < 1001; i++) {
            if (ans[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
