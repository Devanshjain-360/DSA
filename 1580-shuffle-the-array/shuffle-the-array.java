class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j= n;
        int x=0;
        int arr[]=new int[2*n];
        while(x<2*n){
            if(x%2!=0) arr[x++] = nums[j++];
            else  arr[x++] = nums[i++];  
        } 
     return arr;  
    }
}