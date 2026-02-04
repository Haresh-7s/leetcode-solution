// Last updated: 2/4/2026, 2:00:10 PM
class Solution {
    public boolean isThree(int n) {
        int count=0;
        int x=n;
        for(int i=1;i<=n;i++){
            if(n%i==0){
              count++;

           
            } 
        }
        if(count<=0)return false;
        if (count==3)return true;
        else return false;
    }
}
