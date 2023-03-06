import java.util.ArrayList;
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int swapIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) swapIndex++;
            else if (swapIndex > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - swapIndex] = temp;
            }
        }
    }
}