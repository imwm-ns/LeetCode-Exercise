class ListNode {
    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val) {this.val = val;}
    ListNode (int val, ListNode next) {this.val = val; this.next = next;}
}

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, 
                        new ListNode(3, new ListNode(4, 
                        new ListNode(5)))));
        reverseBetween(head, 2, 4);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) return head;

        ListNode prev = null, cur = head;

        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--; right--;
        }

        ListNode start = prev, end = cur;

        while (right > 0) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            right--;
        }

        if (start != null) start.next = prev;
        else head = prev;
        
        end.next = cur;

        return head;
    }
}
