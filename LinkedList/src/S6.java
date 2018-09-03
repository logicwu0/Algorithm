import java.util.HashSet;

public class S6 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        ListNode cur = head;
        while(cur != null) {
            if(hashset.add(cur.data)) {
                cur = cur.next;
            }
            else {
                hashset1.add(cur.data);
                cur = cur.next;
            }
        }
        System.out.println(hashset);
        System.out.println(hashset1);
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while(prev.next != null) {
            System.out.println(prev.data);
            if(hashset1.contains(prev.next.data)) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next.next = new ListNode(5);

        S1 s = new S1();
        System.out.println(s.printListFromTailToHead(deleteDuplicates(listNode)));
    }
}
