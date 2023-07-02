import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        // Ensure a value of k is within a boundary of arrays.
        if (k >= nums.length) k %= nums.length;
        // Reverse entries number in array.
        reverse(nums, 0, nums.length - 1);
        // Reverse numbers from first element to k element.
        reverse(nums, 0, k - 1);
        // Reverse remaining numbers.
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] num, int start, int end) {
        while (start < end) {
            // Keep a original value of start into temp variable.
            int temp = num[start];
            num[start] = num[end]; num[end] = temp;
            start++; end--;
        }
    }
}