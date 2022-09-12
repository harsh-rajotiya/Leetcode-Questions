class Solution {

    public String reverseWords(String s) {
        String[] ans = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String w : ans) {
            StringBuilder reverse = new StringBuilder(w);
            result.append(reverse.reverse() + " ");
        }

        return result.toString().trim();
    }
}
