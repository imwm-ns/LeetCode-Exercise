public class Reorderlst {
    public static void main(String[] args) {
        ListNode head = new ListNode(1 , new ListNode(2, new ListNode(3, new ListNode(4))));
        reorderlist(head);

    }   
    
    public static void reorderlist(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode currentNode = slow.next;
        slow.next = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }

        ListNode curr1 = head;
        ListNode curr2 = prev;

        while (curr1 != null & curr2 != null) {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }
    }
}
