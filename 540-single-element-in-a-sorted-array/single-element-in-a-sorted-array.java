class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == 0) {
                if (nums[0] != nums[1])
                    return nums[0];
                lo = 1;
                continue;
            }
            if (mid == nums.length - 1) {
                if (nums[mid] != nums[mid - 1])
                    return nums[mid];
                hi = mid - 1;
                continue;
            }
            if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                return nums[mid];
            }
        }
        return -1;
    }
}