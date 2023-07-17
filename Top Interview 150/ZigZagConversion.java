public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "A";
        int numRows = 2;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if (s.length() <= 1) return s;
        String[] arr = new String[numRows];
        int j = 0, dir = 1;
        for (int i = 0; i < s.length(); i++) {
            if (arr[j] == null) arr[j] = "";
            arr[j] += s.charAt(i);

            if (dir == 1 && j == numRows - 1) dir = -1;
            else if (dir == -1 && j == 0) dir = 1;

            j += dir;
        }

        String res = "";

        for (String word : arr) res += word;
        return res;
    }
}