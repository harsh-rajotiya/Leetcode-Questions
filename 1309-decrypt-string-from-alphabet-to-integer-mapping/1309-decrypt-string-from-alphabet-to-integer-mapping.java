class Solution {

    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                ans.append((char) (Integer.parseInt(s.substring(i, i + 2)) + 96));
                i += 2;
            } else {
                ans.append((char) (Integer.parseInt(String.valueOf(s.charAt(i))) + 96));
            }
        }
        return ans.toString();
    }
}
