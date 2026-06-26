class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum =0;
        int result=0;
        while(n>0){
            product=n%10*product;
            sum =n%10+sum;
            n=n/10;
        }
        result=product-sum;
        return result;
    }
}