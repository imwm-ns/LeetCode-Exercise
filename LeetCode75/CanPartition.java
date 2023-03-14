public class CanPartition {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, sum = 0;

        for (i = 0; i < n; i++) sum += nums[i];

        if (sum % 2 != 0) return false;

        boolean partition[][] = new boolean[sum / 2 + 1][n + 1];

        for (i = 0; i <= n; i++) partition[0][i] = true;

        for (i = 1; i <= sum / 2; i++) partition[i][0] = false;

        for (i = 1; i <= sum / 2; i++) {
            for (j = 1; j <= n; j++) {
                partition[i][j] = partition[i][j - 1];
                if (i >= nums[j - 1]) {
                    partition[i][j] = partition[i][j] || partition[i - nums[j - 1]][j - 1];
                }
            }
        }
        return partition[sum / 2][n];
    }
}
