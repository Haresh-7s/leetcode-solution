// Last updated: 2/4/2026, 1:59:45 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;
        int num=x;
        while(x!=0){
         sum+=x%10;
         x/=10;
        }
        if (num%sum==0)return sum;
        else return -1;
    }
}