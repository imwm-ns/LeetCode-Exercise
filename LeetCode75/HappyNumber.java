import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> digits = new HashSet<>();

        while (digits.add(n)) {
            int result = 0;
            while (n > 0) {
                result += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = result;
        }
        return n == 1;
    }
}
