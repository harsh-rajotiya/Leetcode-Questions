class Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char last = (char) (columnNumber % 26 + 'A');
            result.append(last);
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
