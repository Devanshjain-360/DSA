class Solution {
    public int arrangeCoins(int n) {
        int x=n;
        int y=0;
        if(n==0) return 0;
        for(int i=1;i<=n;i++){
            if(x>=i){
            x=x-i;
            y=i;
            }
            else break;
        }
        if(n>=0) return y;
        return 0;
    }
}