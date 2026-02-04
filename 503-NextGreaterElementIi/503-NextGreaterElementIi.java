// Last updated: 2/4/2026, 2:00:25 PM
import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse array twice (circular)
        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            // Pop smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }

            // Fill result only in first pass (i < n)
            if (i < n) {
                res[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            // Push current element
            stack.push(curr);
        }

        return res;
    }
}