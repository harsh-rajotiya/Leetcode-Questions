class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for (String s : words) {
            boolean match = true;

            for (char c : s.toCharArray()) {
                if (!set.contains(c)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }
        return count;
    }
}
