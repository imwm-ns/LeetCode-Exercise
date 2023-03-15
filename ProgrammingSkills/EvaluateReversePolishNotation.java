import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int result = 0;

        for (String ch : tokens) {
            int value2 = 0;
            int value1 = 0;
            int res = 0;
            switch (ch) {
                case "+":
                    value2 = Integer.parseInt(stack.pop());
                    value1 = Integer.parseInt(stack.pop());
                    res = value1 + value2;
                    stack.push(Integer.toString(res));
                    break;
                case "-":
                    value2 = Integer.parseInt(stack.pop());
                    value1 = Integer.parseInt(stack.pop());
                    res = value1 - value2;
                    stack.push(Integer.toString(res));
                    break;
                case "*":
                    value2 = Integer.parseInt(stack.pop());
                    value1 = Integer.parseInt(stack.pop());
                    res = value1 * value2;
                    stack.push(Integer.toString(res));
                    break;
                case "/":
                    value2 = Integer.parseInt(stack.pop());
                    value1 = Integer.parseInt(stack.pop());
                    res = value1 / value2;
                    stack.push(Integer.toString(res));
                    break;
                default:
                    stack.push(ch);
                    break;
            }
        }

        result = Integer.parseInt(stack.pop());
        return result;
    }
}
