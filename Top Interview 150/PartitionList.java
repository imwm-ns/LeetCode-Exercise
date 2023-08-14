class ListNode {
    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val) {this.val = val;}
    ListNode (int val, ListNode next) {this.val = val; this.next = next;}
}

public class PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        partition(head, 2);
    }

    public static ListNode partition(ListNode head, int target) {
        ListNode frontDummy = new ListNode(0), backDummy = new ListNode(0);
        ListNode front = frontDummy, back = backDummy;
        while (head != null) {
            if (head.val < target) {
                front.next = head;
                front = head;
            }
            else {
                back.next = head;
                back = head;
            }
            head = head.next;
        }
        front.next = backDummy.next;
        back.next = null;
        return frontDummy.next;
    }
}