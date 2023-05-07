package ExtraPractice;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class SwapPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = swapPairs(head);
        printNode(head);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dum = new ListNode(0);
        ListNode res = dum;

        while (head != null) {
            if (head.next != null) {
                ListNode sw = new ListNode(head.next.val, new ListNode(head.val));
                res.next = sw;
                res = sw.next;
                head = head.next.next;
            } 
            else {
                ListNode sw = new ListNode(head.val);
                res.next = sw;
                res = sw;
                head = head.next;
            }
        }

        return dum.next;
    }

    public static void printNode(ListNode head) {
        while (head != null) {
            if (head.next != null) {
                System.out.println(head.val);
            }
            else {
                System.out.println(head.val);
            }
            head = head.next;
        }
    }
}
