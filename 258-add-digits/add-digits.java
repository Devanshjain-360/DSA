class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int i = 0;
            while (num > 0) {
                i = i + num % 10;
                num = num / 10;
            }
            num=i;
        }
        return num;
    }
}