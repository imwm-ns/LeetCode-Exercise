public class OddEvenList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1 , new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        oddEvenList(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode next = head.next;
        ListNode copy = next;

        while (next != null && next.next != null) {
            temp.next = next.next;
            temp = temp.next;
            next.next = temp.next;
            next = next.next;
        }
        temp.next = copy;
        return head;
    }
}
