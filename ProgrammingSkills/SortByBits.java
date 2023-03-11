import java.util.Arrays;

public class SortByBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
       System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] += 10001 * Integer.bitCount(arr[i]);
        }
        
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] % 10001;
        }

        return arr;
    }
}
