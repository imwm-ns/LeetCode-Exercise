public class NumSubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6}; int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int cnt = 0;
        int product = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (i <= j && product >= k) product /= nums[i++];
            cnt += j - i + 1;
        }
        return cnt;
    }
}
