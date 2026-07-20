class Solution {
    public int fib(int n) {

        if(n==0) return 0;
        if(n==1) return 1;

        int x=0;
        int y=1;
        int sum=0;
        for(int i=0;i<n-1;i++){
           sum=x+y;
           x=y;
           y=sum; 
        }
        return sum;
    }
}