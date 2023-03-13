public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    public static int rob (int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dynamic = new int[nums.length];
        dynamic[0] = nums[0];
        dynamic[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dynamic[i] = Math.max(nums[i] + dynamic[i - 2], dynamic[i - 1]);
        }
        return dynamic[nums.length - 1];
    }
}
