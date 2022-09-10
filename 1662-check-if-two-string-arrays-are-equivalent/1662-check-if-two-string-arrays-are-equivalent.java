class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for (String a : word1) w1.append(a);
        for (String b : word2) w2.append(b);

        return w1.toString().equals(w2.toString());
    }
}
