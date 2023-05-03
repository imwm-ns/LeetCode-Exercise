package ExtraPractice;

public class Power {
    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }

    public static double power(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while (n != 0) {
            if ((n & 1) != 0) pow *= x;
            x *= x;
            n >>>= 1;
        } 

        return pow;
    }
}
