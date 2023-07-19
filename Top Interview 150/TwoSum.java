import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15}; int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) right--;
            else left++;
        }

        return new int[]{++left, ++right};
    }
}
