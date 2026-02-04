// Last updated: 2/4/2026, 2:00:36 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
        
    }
}