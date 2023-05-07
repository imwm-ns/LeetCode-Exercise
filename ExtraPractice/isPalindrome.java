package ExtraPractice;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 1000000001;
        boolean isPalindrome = palindrome(x);
        System.out.println(isPalindrome);
    }

    public static boolean palindrome(int x) {
        if (x < 0) return false;
        
        int tmp = x;
        int reverse = 0;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return tmp == reverse ? true : false;
    }
}