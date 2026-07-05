class Solution {
    public boolean isPalindrome(int x) {
        int i=0;
        int y=x;
        while(x>0){
            i= i*10+x%10;
            x=x/10;
        }
        if(i==y) return true;
        else return false;
        
    }
}