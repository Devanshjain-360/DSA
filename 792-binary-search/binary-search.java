class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int hi=nums.length-1;
        while(low<=hi){
            int mid = (low + hi)/2;
            if(target<nums[mid]){
                hi =mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else {
                return mid;
            }
        }
    return -1;
    }
}