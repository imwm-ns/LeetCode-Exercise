import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddToArrayForm {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        Stack<Integer> stack = new Stack<>();
        int carry = k;
        int i = num.length - 1;

        while (i >= 0 || carry > 0) {
            if (i >= 0) carry += num[i];

            stack.push(carry % 10);
            carry /= 10;
            i--;
        }    

        List<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}
