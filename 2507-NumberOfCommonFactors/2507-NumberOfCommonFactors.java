// Last updated: 2/4/2026, 2:00:07 PM
class Solution {
    public int commonFactors(int a, int b) {
        int sum = 0;
        int limit = Math.min(a, b);

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}
