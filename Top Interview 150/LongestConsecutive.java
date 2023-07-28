import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] num = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(num));
    }

    public static int longestConsecutive(int[] num) {
        if (num.length < 2) return num.length;
        int length = 1, current = 1;

        Arrays.sort(num);

        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) continue;
            if (num[i] == num[i - 1] + 1) current++;
            else {
                length = Math.max(length, current);
                current = 1;
            }
        }

        return Math.max(length, current);
    }
}
