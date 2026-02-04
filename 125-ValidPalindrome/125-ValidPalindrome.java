// Last updated: 2/4/2026, 2:00:46 PM
class Solution {
    public boolean isPalindrome(String s) {
        // 1. Convert to lowercase
        s = s.toLowerCase();

        // 2. Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");

        // 3. Reverse the cleaned string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        // 4. Compare original and reversed
        return s.equals(rev);
    }
}
