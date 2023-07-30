class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, 
                        new ListNode(3, new ListNode(4, 
                        new ListNode(5)))));
        reverseKGroup(head, 3);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        /*
            Step:
                1. Check the first condition as if head = null or head.next = null return head.
                2. Create a new ListNode as dummy and set a next value of dummy as head.
                3. Initialize 3 pointers as prev, cur, next.
                4. Count a length of head onto a count variable.
                5. Use a while loop to traverse until count variable less than k - constant value.
                6. Set a value of cur = prev.next, next = cur.next.
                7. Reverse ListNode group using by for loop and start with index as 1.
                8. After a for loop finished. set a value of prev as cur and decrement a value of count with k - constant value.
                9. Return a ListNode as dummy.next after the processes have finished.
            
            ?? why do u leave me alone ??
        */

        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy, cur = dummy, next = dummy;

        int count = 0;
        while (cur.next != null) {
            count++;
            cur = cur.next;
        }

        while (count >= k) {
            cur = prev.next;
            next = cur.next;

            for (int i = 1; i < k; i++) {
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }

            prev = cur;
            count -= k;
        }

        return dummy.next;
    }
}
