class Solution {
    public int maximumCount(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if( nums[i]==0) continue;
            else if(nums[i]>0) x++;
            else if(nums[i]<0) y++;
        }
        if(x==y)return x;
        else if(x>y)return x;
        else if(x<y)return y;
        return -1;
    }
}