// Last updated: 2/4/2026, 1:59:51 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num2=0;
        int sum=0;
        for(int i=1;i<=n;i++){
             if(i%m==0){
                num2+=i;
             }
             else{
                sum+=i;
             }
        
        }
        return sum-num2;
        
    }
}