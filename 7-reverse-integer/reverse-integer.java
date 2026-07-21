
class Solution {
    public int reverse(int x) {
        int y = 0;
        if (x > 0) {
            while (x > 0) {
                if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && x > 7)){
                    return 0;
                }
                y = y * 10 + x % 10;
                x = x / 10;
            }
            return y;
        } else if (x < 0) {
            x = x * -1;
            if (x > 0) {
                while (x > 0) {
                    if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && x > 7)){
                        return 0;
                    }
                    y = y * 10 + x % 10;
                    x = x / 10;
                }
                return -y;
            }
        }
        return y;
    }
}