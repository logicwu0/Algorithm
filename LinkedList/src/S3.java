/**
 * Reverse Linked List
 *
 * 翻转链表
 *
 * */
//时间复杂度O(N)
public class S3 {

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode tail = null;
        ListNode p = head;
        ListNode q = head.next;

        while (q != null) {
            ListNode old = q.next;
            p.next = tail;
            q.next = p;

            tail = p;
            p = q;
            q = old;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(17);
        listNode.next.next.next = new ListNode(4);

        S1 s = new S1();
        System.out.println(s.printListFromTailToHead(reverseList(listNode)));
    }
}
