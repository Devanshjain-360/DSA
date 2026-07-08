class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
           
            if(target < nums[mid]) {
                hi = mid - 1;
            }
            else if (target > nums[mid]){
                lo = mid + 1;
            }
            else if(nums[mid] == target) {
                first = mid;
                last = mid;
                while(first > 0 && nums[first - 1] == target) {
                    first--;
                }
                while(last < nums.length-1 && nums[last + 1] == target) {
                    last++;
                }
                break;
            }
        }
        return new int[]{first, last};
    }
}