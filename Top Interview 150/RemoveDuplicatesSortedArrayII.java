import java.util.Arrays;

public class RemoveDuplicatesSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums) + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
