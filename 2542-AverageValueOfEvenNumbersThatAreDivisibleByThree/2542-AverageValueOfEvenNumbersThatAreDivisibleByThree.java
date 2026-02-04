// Last updated: 2/4/2026, 2:00:06 PM
class Solution {
    public int averageValue(int[] nums) {
        int x=0;
        int avg=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2==0)&&(nums[i]%3==0)){
                count ++;
                x+=nums[i];




            }
        }
        if(count==0)return 0;
        else return avg=x/count;
    }
}