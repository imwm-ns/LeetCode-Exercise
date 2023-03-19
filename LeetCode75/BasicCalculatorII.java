import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        int res = 0, cur = 0, i = 0, n = s.length();
        char sign = '+';
        Stack<Integer> stack = new Stack<Integer>();

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch))
                cur = cur * 10 + ch - '0';

            if(i == n - 1 || (!Character.isDigit(ch) && ch != ' ')){
                if(sign == '+')
                    stack.push(cur ) ;
                else if(sign == '-')
                    stack.push(-cur ) ;
                else if(sign == '*')
                    stack.push(cur * stack.pop());
                else if(sign == '/')
                    stack.push(stack.pop() / cur ) ;
                sign = ch;
                cur = 0;
            }
            i++;
        }
        while(!stack.isEmpty()) res += stack.pop();
        return res;
    }
}