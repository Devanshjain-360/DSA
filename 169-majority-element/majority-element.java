class Solution {
    public int majorityElement(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(y==0){
                y=1;
                x = nums[i];
            }
            else if(x==nums[i]){
                y++;
            }
            else{
                y--;
            }
        }
        int z = 0;
        for(int i=0;i<nums.length;i++){
            if(x==nums[i]){
                z++;
            }
        }
        if(z>nums.length/2){
            return x;
        }
        else{
            return -1;
        }
    }
}