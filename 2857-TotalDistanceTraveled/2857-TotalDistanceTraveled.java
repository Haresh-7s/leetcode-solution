// Last updated: 2/4/2026, 1:59:54 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        return (mainTank + Math.min((mainTank - 1) / 4, additionalTank)) * 10;
    }
}