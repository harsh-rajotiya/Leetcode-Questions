class Solution {

    public double average(int[] salary) {
        Arrays.sort(salary);

        int n = salary.length;
        double s = salary[1];

        for (int i = 2; i < n - 1; i++) {
            s = s + salary[i];
        }
        return s / (n - 2);
    }
}
