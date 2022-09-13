class Solution {

    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                result.append(word.substring(0, word.indexOf(ch) + 1));
                result.reverse();
                result.append(word.substring(i + 1));
                return result.toString();
            }
        }
        return word;
    }
}
