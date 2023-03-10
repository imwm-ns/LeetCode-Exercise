public class FreqAlphabets {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        String res = "";
        char[] alphabets = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) ('a' + i);
        }
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.length() > i + 2 && s.charAt(i + 2) == '#') {
                n = Integer.parseInt(s.substring(i, i + 2));
                res += alphabets[n - 1];
                i += 2;
            }
            else {
                n = Integer.parseInt("" + ch);
                res += alphabets[n - 1];
            }
        }
        return res;
    }
}
