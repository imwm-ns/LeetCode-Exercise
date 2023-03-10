public class MiddleNode {
    public static void main(String[] args) {
        ListNode middle = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode head = new ListNode(1, new ListNode(2, middle));
        printNode(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printNode(ListNode head) {
        if (head == null) return;
        System.out.println(head.val);
        printNode(head.next);
    }
}
