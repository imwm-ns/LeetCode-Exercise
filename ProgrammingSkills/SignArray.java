public class SignArray {
    public int arraySign(int[] nums) {
        double multiplyNum = 1;
        for (int i = 0; i < nums.length; i++) multiplyNum *= nums[i];
        if (multiplyNum > 0) return 1;
        else if (multiplyNum < 0) return -1;
        return 0;
    }
}
