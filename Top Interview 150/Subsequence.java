public class Subsequence {
    public static void main(String[] args) {
        String sequence = "ab", target = "baab";
        System.out.println(isSubsequence(sequence, target));
    }

    public static boolean isSubsequence(String sequence, String target) {
        int left = sequence.length(), right = target.length(), cur = 0;

        if (left == 0) return true;
        if (left > right) return false;

        for (int i = 0; i < right; i++) {
            if (sequence.charAt(cur) == target.charAt(i)) {
                if (cur == (left - 1)) return true;
                cur++;
            }
        }
        return false;
    }
}
