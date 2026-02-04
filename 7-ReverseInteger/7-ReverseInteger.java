// Last updated: 2/4/2026, 2:00:58 PM
class Solution {
    public int reverse(int x) {
        long count = 0;

        while (x != 0) {
            count = count * 10 + x % 10;
            x /= 10;
        }

        if (count > Integer.MAX_VALUE || count < Integer.MIN_VALUE)
            return 0;

        return (int) count;
    }
}
