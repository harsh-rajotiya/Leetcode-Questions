class Solution {
    int count = 0;

    public int numTilePossibilities(String tiles) {
        char[] ch = tiles.toCharArray();
        Arrays.sort(ch);
        boolean[] visited = new boolean[ch.length];
        helper(ch, 0, visited);
        return count;
    }

    private void helper(char[] ch, int p, boolean[] visited) {
        if (p == ch.length) {
            return;
        }

        for (int i = 0; i < ch.length; i++) {
            if (visited[i] || (i > 0 && ch[i] == ch[i - 1] && !visited[i - 1])) {
                continue;
            }
            count++;
            visited[i] = true;
            helper(ch, p + 1, visited);
            // Backtracking
            visited[i] = false;
        }
    }
}
