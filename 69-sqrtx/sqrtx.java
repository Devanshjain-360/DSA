class Solution {
    public int mySqrt(int x) {
        int i=0;
        int j=x;
        while(i<=j){
            int mid=i+(j-i)/2;
            long sq = (long)mid*mid;//long used to prevent overflow
            if(mid*mid==x ){
            return mid;
            }
            else if(sq>x && (long)(mid-1)*(mid-1)<x){//same here
                return mid-1;
            }
             else if(sq<x && (long)(mid+1)*(mid+1)>x){//same here
                return mid;
            }
            else if(sq>x){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        } 
        return 0;
    }
}