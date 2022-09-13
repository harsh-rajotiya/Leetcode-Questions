class Solution {

    public int maxRepeating(String sequence, String word) {
        String res = word;
        int count = 0;
        while (sequence.contains(res)) {
            res += word;
            count++;
        }
        return count;
    }
}
