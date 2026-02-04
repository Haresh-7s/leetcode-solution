// Last updated: 2/4/2026, 2:00:50 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();  // last la iruka spaces remove
        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}
