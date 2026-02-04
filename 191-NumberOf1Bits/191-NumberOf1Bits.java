// Last updated: 2/4/2026, 2:00:40 PM
class Solution {
    public int hammingWeight(int n) {
        int temp=0;
        while(n>0){
            n = n & (n - 1);
            temp++;
           
            }
        return temp;
       
    }
}