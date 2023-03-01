import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int prevSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prevSum += nums[i];
            runningSum[i] = prevSum;
        }

        return runningSum;
    }
}