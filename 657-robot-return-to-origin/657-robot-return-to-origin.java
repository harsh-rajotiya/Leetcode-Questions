class Solution {

    public boolean judgeCircle(String moves) {
        char[] array = moves.toCharArray();
        int U = 0;
        int R = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'U') {
                U++;
            } else if (array[i] == 'D') {
                U--;
            } else if (array[i] == 'R') {
                R++;
            } else if (array[i] == 'L') {
                R--;
            }
        }

        if (U == 0 && R == 0) {
            return true;
        }
        return false;
    }
}
