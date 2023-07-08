public class JumpGameI {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int i = 0;
        for (int reach = 0; i < nums.length && i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
        }
        return i == nums.length;
    }
}
