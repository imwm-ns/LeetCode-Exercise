public class MergeTwoLists {
    public static void main(String[] args) {
        
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
            1. Use recursion to merge two list.
                if (list1 == null) return list2;
                if (list2 == null) return list1;

                if (list1.val < list2.val) {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                }
                else {
                    list2.next = mergeTwoLists(list1, list2.next);
                    return list2;
                }
        */
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        while (true) {
            if (list1 == null) {
                res.next = list2;
                break;
            }
            if (list2 == null) {
                res.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                res.next = list1;
                list1 = list1.next;
            }
            else {
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {this.val = val;}
    ListNode (int val, ListNode next) {this.val = val; this.next = next;}
}