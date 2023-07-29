import java.util.Stack;

public class BasicCalculate {
    public static void main(String[] args) {
        
    }

    public static int calculate(String msg) {
        int length = msg.length(), res = 0, sign = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(msg.charAt(i))) {
                int sum = msg.charAt(i) - '0';
                
                while (i + 1 < length && Character.isDigit(msg.charAt(i + 1))) {
                    sum = sum * 10 + msg.charAt(i + 1) - '0';
                    i++;
                }

                res += sum * sign;
            }
            else if (msg.charAt(i) == '+') sign = 1;
            else if (msg.charAt(i) == '-') sign = -1;
            else if (msg.charAt(i) == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0; sign = 1;
            }
            else if (msg.charAt(i) == ')') {
                res = res * stack.pop() + stack.pop();
            }
        }

        return res;
    }
}
