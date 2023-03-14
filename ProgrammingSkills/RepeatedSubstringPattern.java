public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int i = 1, j = 0, n = s.length();
        int[] dp = new int[n + 1];

        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) dp[++i] = ++j;
            else {
                if (j == 0) i++;
                else j = dp[j];
            }
        }
        return dp[n] != 0 && (dp[n] % (n - dp[n]) == 0);
    }
}