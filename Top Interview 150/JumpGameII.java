public class JumpGameII {
    public static void main(String[] args) {
        
    }

    public static int canJump(int[] nums) {
        int len = nums.length - 1, current = -1, next = 0, res = 0;
        for (int i = 0; next < len; i++) {
            if (i > current) {
                current = next;
                res++;
            }
            next = Math.max(next, i + nums[i]);
        }
        return res;
    }
}
