class Solution {

    public int getXORSum(int[] arr1, int[] arr2) {
        int ans1 = 0, ans2 = 0;

        // Xor sum of first array
        for (int i = 0; i < arr1.length; i++) ans1 = ans1 ^ arr1[i];

        // Xor sum of second array
        for (int i = 0; i < arr2.length; i++) ans2 = ans2 ^ arr2[i];

        // Required answer
        return (ans1 & ans2);
    }
}
