public class RotateRight {
    public static void main(String[] args) {
        
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }

        curr.next = head;
        k %= len;
        k = len - k;
        while (k != 0) {
            curr = curr.next;
            k--;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
