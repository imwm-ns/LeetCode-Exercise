import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] num1 = {1, 2, 3, 0, 0, 0}, num2 = {2, 5, 6};
        merge(num1, m, num2, n);
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + ", ");
        }
    }

    public static void merge(int[] num1, int m, int[] num2, int n) {
        for (int i = m, j = 0; j < n; j++) {
            num1[i] = num2[j];
            i++;
        }
        Arrays.sort(num1);
    }
}