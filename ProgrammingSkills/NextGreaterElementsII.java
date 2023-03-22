import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementsII {
    public static void main(String[] args) {
        int[] nums = {1,5,3,6,8}; // {5,4,3,2,1} 1,2,3,4,3
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Stack <Integer> st = new Stack <>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty() == false) res[i] = st.peek();
                else res[i] = -1;
            }
            st.push(nums[i % n]);
        }
        return res;
    }
}