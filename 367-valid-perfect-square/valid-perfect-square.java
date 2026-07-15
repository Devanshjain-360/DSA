class Solution {
    public boolean isPerfectSquare(int x) {
        int i=0;
        int j=x;
        while(i<=j){
            int mid=i+(j-i)/2;
            long sq = (long) mid * mid;

            if(sq==x){
            return true;
            }
            else if(sq>x){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        } 
        return false;
    }
}