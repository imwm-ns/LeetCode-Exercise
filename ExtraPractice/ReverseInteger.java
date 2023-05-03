package ExtraPractice;

public class ReverseInteger {
    public static void main(String[] args) {
        int tmp = -12345;
        int rev = reverse(tmp);
        System.out.println("Reverse Number is " + rev);
    }  
    
    public static int reverse(int x) {
        long rev = 0;
        int tmp = x;

        while (x != 0) {
            rev += x % 10;
            rev *= 10;
            x /= 10;
        }
        rev = rev / 10;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        if (tmp < 0) return (int) rev;
        return (int) rev;
    }
}
