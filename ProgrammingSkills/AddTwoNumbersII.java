import java.util.Stack;

public class AddTwoNumbersII {
    public static void main(String[] args) {
        
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode ptr = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) sum += stack1.pop();
            if (!stack2.isEmpty()) sum += stack2.pop();

            ptr.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = ptr;
            ptr = head;
            sum /= 10;
        }
        return ptr.val == 0 ? ptr.next : ptr;
    }
}
