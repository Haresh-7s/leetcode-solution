// Last updated: 2/4/2026, 2:00:00 PM
class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        int x=0;
         while(num!=0){
           x=num%10;
           if(temp%x==0)
           count++;
           num/=10;
         }
         return count;
          
        
    }
}