// Last updated: 2/4/2026, 2:00:41 PM
class Solution {
    public int trailingZeroes(int n) {
        int count =0;
        while(n>=5)
        {
            count+=n/5;
            n=n/5;
        }
        return count ;
           
    }
}