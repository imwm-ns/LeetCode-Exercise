package ExtraPractice;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "-91283472332";
        int num = converter(s);
        System.out.println(num);
    }

    // String to Integer
    public static int converter(String s) {
        int idx = 0;

        while (idx < s.length() && s.charAt(idx) == ' ') idx++;

        if (idx >= s.length()) return 0;

        boolean negative = s.charAt(idx) == '-';

        if (negative || s.charAt(idx) == '+') idx++;

        int res = 0;

        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            int digit = s.charAt(idx) - '0';

            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 &&  digit > 7) return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            res = (res * 10) + digit;
            idx++;
        }

        return negative ? -1 * res : res;
    }
}
