import java.util.Arrays;

public class SortList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        sortList(head);
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;

        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        temp = head;
        int[] value = new int[count];
        count = 0;

        while (temp != null) {
            value[count++] = temp.val;
            temp = temp.next;
        }

        temp = head;
        Arrays.sort(value);
        count = 0;

        while (temp != null) {
            temp.val = value[count++];
            temp = temp.next;
        }
        return temp;
    }
}
