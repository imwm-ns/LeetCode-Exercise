class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, 
                        new ListNode(3, new ListNode(3, 
                        new ListNode(4, new ListNode(4, 
                        new ListNode(5)))))));
        deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = new ListNode(), res = temp;
        int flag = 0;

        while (head.next != null) {
            if (head.next.val != head.val) {
                if (flag == 1) head = head.next;
                else {
                    temp.next = head;
                    temp = temp.next;
                    head = head.next;
                }
                flag = 0;
            }
            else {
                flag = 1;
                head = head.next;
            }
        }
        if (flag == 1) temp.next = null;
        else temp.next = head;

        return res.next;
    }
}
