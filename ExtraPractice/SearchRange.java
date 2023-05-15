package ExtraPractice;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
        System.out.println();
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0, right = nums.length - 1, idx = -1, mid;

        // Find First Position
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                idx = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else right = mid - 1;
        }

        // Set a value in result at 0's
        res[0] = idx;

        // Reset value
        left = 0;
        right = nums.length - 1;
        idx = -1;
        mid = 0;

        // Find Last Position
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                idx = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else right = mid - 1;
        }

        //Set value in result at 1's
        res[1] = idx;

        return res;
    }
}
