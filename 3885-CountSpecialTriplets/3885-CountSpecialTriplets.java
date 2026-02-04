// Last updated: 2/4/2026, 1:59:46 PM
import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    /**
     * LeetCode expects the method name to be "specialTriplets"
     */
    public int specialTriplets(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> left = new HashMap<>(); // numbers seen so far
        long ans = 0;

        for (int num : nums) {
            int target = num * 2;               // we need nums[i] == target and nums[k] == target

            // temporarily remove the current element from the remaining count
            freq.put(num, freq.get(num) - 1);

            // left side: how many target values are already seen (i < current index)
            long leftCnt = left.getOrDefault(target, 0);

            // right side: how many target values are still ahead (k > current index)
            long rightCnt = freq.getOrDefault(target, 0);

            ans = (ans + leftCnt * rightCnt) % MOD;

            // add current number to the "left" side for future positions
            left.put(num, left.getOrDefault(num, 0) + 1);
        }

        return (int) ans;
    }
}