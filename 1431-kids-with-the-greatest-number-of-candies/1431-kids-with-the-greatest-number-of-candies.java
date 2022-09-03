class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxi = -999999;
        List<Boolean> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, candies[i]);
        }
        for (int i : candies) {
            ans.add(i >= maxi - extraCandies);
        }
        return ans;
    }
}
