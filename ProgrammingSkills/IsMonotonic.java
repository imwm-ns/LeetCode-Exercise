public class IsMonotonic {
    public static void main(String[] args) {
        int[] nums = {6,5,4,4};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic (int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) increasing = false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) decreasing = false;
        }

        return increasing || decreasing;
    }
}