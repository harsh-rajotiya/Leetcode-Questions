class Solution {

    public boolean isAnagram(String s, String t) {
        boolean anagram = true;
        int[] arr = new int[256];

        for (char c : s.toCharArray()) {
            int index = (int) c;
            arr[index]++;
        }

        for (char c : t.toCharArray()) {
            int index = (int) c;
            arr[index]--;
        }

        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            return true;
        } else {
            return false;
        }
    }
}
