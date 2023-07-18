public class ValidPalindrome {
    public static void main(String[] args) {
        // String s = "A man, a plan, a canal: Panama";
        String s = "0P";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;

        int i = 0, j = s.length() - 1;

        while (i <= j) {
            char curStart = s.charAt(i);
            char curLast = s.charAt(j);

            if (!Character.isLetterOrDigit(curStart)) i++;
            else if (!Character.isLetterOrDigit(curLast)) j--;
            else {
                if (Character.toLowerCase(curStart) != Character.toLowerCase(curLast)) return false;
                i++; j--;
            }
        }

        return true;
    }
}