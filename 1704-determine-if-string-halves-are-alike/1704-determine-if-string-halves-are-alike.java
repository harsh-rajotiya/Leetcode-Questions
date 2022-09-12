class Solution {

    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2, s.length());
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                x++;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                y++;
            }
        }

        return (x == y);
    }
}
