class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> ans = new HashMap<>();

        ans.put('I', 1);
        ans.put('V', 5);
        ans.put('X', 10);
        ans.put('L', 50);
        ans.put('C', 100);
        ans.put('D', 500);
        ans.put('M', 1000);

        int result = ans.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (ans.get(s.charAt(i + 1)) > ans.get(s.charAt(i))) {
                result -= ans.get(s.charAt(i));
            } else {
                result += ans.get(s.charAt(i));
            }
        }
        return result;
    }
}
