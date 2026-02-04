// Last updated: 2/4/2026, 1:59:59 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        
        for (int num : nums) {
            elementSum += num;
            
            // compute digit sum for this number
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10; // add last digit
                temp /= 10;            // remove last digit
            }
        }
        
        return Math.abs(elementSum - digitSum);
    }
}