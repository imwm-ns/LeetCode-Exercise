import java.util.Stack;

public class IsPalindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2))));
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode temp = head; boolean isPalindrome = true;

        Stack<Integer> stack = new Stack<Integer>();

        while (temp != null) {
            System.out.println("Before temp val: " + temp.val);
            stack.push(temp.val);
            temp = temp.next;

        }

        while (head != null) {
            int num = stack.pop();
            System.out.println("pop num: " + num);

            if (head.val != num) {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }
}
