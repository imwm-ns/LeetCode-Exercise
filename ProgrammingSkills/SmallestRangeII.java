import java.util.Arrays;

public class SmallestRangeII {
    public static void main(String[] args) {
        int[] nums = {0, 10}; int k = 2;
        System.out.println(smallestRangeII(nums, k));
    }

    public static int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int score = nums[n - 1] - nums[0];
        int res = score;

        for (int div = 0; div < n - 1; div++) {
            int maxNum = Math.max(nums[div] + k, nums[n - 1] - k);
            int minNum = Math.min(nums[div + 1] - k, nums[0] + k);
            
            score = maxNum - minNum;
            res = Math.min(res, score);
        }
        return res;
    }
}
