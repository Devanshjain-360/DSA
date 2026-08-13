class Solution {
    public String intToRoman(int nums) {
        String s = "";

        while (nums >= 1000) {
            nums = nums - 1000;
            s = s + "M";
        }
        if (nums < 1000 && nums >= 900) {
            nums = nums - 900;
            s = s + "CM";
        }
        while (nums >= 500) {
            nums = nums - 500;
            s = s + "D";
        }
        if (nums < 500 && nums >= 400) {
            nums = nums - 400;
            s = s + "CD";
        }
        while (nums >= 100) {
            nums = nums - 100;
            s = s + "C";
        }
        if (nums < 100 && nums >= 90) {
            nums = nums - 90;
            s = s + "XC";
        }
        while (nums >= 50) {
            nums = nums - 50;
            s = s + "L";
        }
        if (nums < 50 && nums >= 40) {
            nums = nums - 40;
            s = s + "XL";
        }
        while (nums >= 10) {
            nums = nums - 10;
            s = s + "X";
        }
        if (nums < 10 && nums >= 9) {
            nums = nums - 9;
            s = s + "IX";
        }
        while (nums >= 5) {
            nums = nums - 5;
            s = s + "V";
        }
        if (nums < 5 && nums >= 4) {
            nums = nums - 4;
            s = s + "IV";
        }
        while (nums >= 1) {
            nums = nums - 1;
            s = s + "I";
        }
        return s;
    }
}