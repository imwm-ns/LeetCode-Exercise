import java.util.HashSet;
import java.util.Set;

public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5};
        System.out.println(canMakeArithmeticProgression(arr));
        /*
            1, 3, 5
            mn = 1, mx = 5
            diff = 5 - 1 -> 4
            4 % 2 != 0 ? return false: continue

            diff = 4 / 2 -> diff = 2
        */
    }   

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, n = arr.length;

        for (int i : arr) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
            seen.add(i);
        }

        int diff = mx - mn;
        if (diff % (n - 1) != 0) return false;

        diff /= n -1;

        while (--n > 0) {
            if (!seen.contains(mn)) return false;
            mn += diff;
        }
        return true;
    }
}
