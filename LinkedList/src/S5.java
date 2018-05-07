/**
 * Merge Two Sorted Lists
 *
 * input:1->2>4,1>3>4
 * output:1->1->2->3->4->4
 * */

public class S5 {

    public ListNode mergeTwoLists(ListNode l1,ListNode l2) {

        if (l1 == null && l2 ==null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode result = new ListNode(0);
        ListNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
        }
            if(l1 != null) {
                prev.next = l1;
            }
            if(l2 != null) {
                prev.next = l2;
            }
        return prev.next;
    }

}
