class Solution {

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '-' || ch == '+' || ch == '*') {
                String a = expression.substring(0, i);
                String b = expression.substring(i + 1);
                List<Integer> left = diffWaysToCompute(a);
                List<Integer> right = diffWaysToCompute(b);
                for (int x : left) {
                    for (int y : right) {
                        if (ch == '-') {
                            result.add(x - y);
                        } else if (ch == '+') {
                            result.add(x + y);
                        } else if (ch == '*') {
                            result.add(x * y);
                        }
                    }
                }
            }
        }
        if (result.size() == 0) result.add(Integer.valueOf(expression));
        return result;
    }
}
