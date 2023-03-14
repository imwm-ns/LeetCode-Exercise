public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int thisMin = nums[0], thisMax = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(Math.max(nums[i], nums[i] * thisMax), nums[i] * thisMin);
            thisMin = Math.min(Math.min(nums[i], nums[i] * thisMax), nums[i] * thisMin);
            thisMax = temp;
            maxSum = Math.max(maxSum, thisMax);
        }
        return maxSum;
    }
}
