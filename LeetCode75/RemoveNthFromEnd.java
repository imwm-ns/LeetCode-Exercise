class RemoveNthFromEnd {
    /*
        Debug
        head = [1, 2, 3, 4, 5], n = 2
        
        cur = head -> head.val = 1, prev = head -> head.val = 1

        while (n-- > 0) {
            round1: (2-- > 0) cur = 1.next -> 2, n = 1
            round2: (1-- > 0) cur = 2.next -> 3, n = 0
        }

        if (cur = 3 == null) return head.next = 2

        while (cur.next != null) {
            round1: (3.next != null) cur = cur.next -> 4, prev = prev.next -> 2
            round2: (4.next != null) cur = cur.next -> 5, prev = prev.next -> 3
        }
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head, prev = head;
        while (n-- > 0) cur = cur.next;

        if (cur == null) return head.next;

        while (cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }    
}
