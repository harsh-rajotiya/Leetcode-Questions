class Solution {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    result.append("o");
                } else {
                    result.append("al");
                }
            }
        }
        return result.toString();
    }
}
