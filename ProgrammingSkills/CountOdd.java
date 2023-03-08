import java.util.Scanner;

public class CountOdd {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int mn = 0;
        int mx = 0;

        String msg = scan.nextLine();
        String[] message = msg.split(", ");
        for (String m : message) {
            int idx = 0;
            for (int i = m.length() - 1; i > 0; i--) {
                if (!Character.isDigit(m.charAt(i))) {
                    idx = i + 1;
                    break;
                }
            }
            int val = Integer.parseInt(m.substring(idx));
            if (val > mn) {
                if (mx < mn) {
                    mx = val;
                    break;
                }
                mn = val;
            }
        }
        countOdd(mn, mx);
    }

    private static int countOdd(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
