class Solution {
    public String reverseWords(String s) {
        int end = s.length();
        String x = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {

                if (i == s.length() - 1) {
                    end = i;
                    continue;
                }

                if (i + 1 == end) {
                    end = i;
                    continue;
                }

                x = x + s.substring(i + 1, end) + " ";
                end = i;
            }
        }
        if (end > 0) {
            x = x + s.substring(0, end);
        }
        return x.trim();
    }
}