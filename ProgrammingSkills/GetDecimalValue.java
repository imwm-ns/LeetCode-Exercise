public class GetDecimalValue {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        do {
            result = (result << 1) + head.val;
        } while ((head = head.next) != null);
        return result; 
    }
}
