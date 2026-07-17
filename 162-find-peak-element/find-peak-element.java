class Solution {
    public int findPeakElement(int[] nums) {
        int lo=0;
        int hi= nums.length-1;  
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            // single element
            if(nums.length==1) return 0;
            // starting element
            else if(mid==0){
                if (nums[0]>nums[1]) return 0;
                else lo= mid+1;
            }
             // Last element
            else if (mid == nums.length - 1) {
                if (nums[mid] > nums[mid - 1])
                    return mid;
                else
                    hi = mid - 1;
            }

            else if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid+1] ) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
}