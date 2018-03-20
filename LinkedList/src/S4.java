/**
 *
 * Odd Even Linked List
 * example
 * 1->2->3->4->5->null
 * 1->3->5->2->4->null
 * */
//创建两个新的空链表，遍历原始链表，奇数的添加到第一个，偶数的添加到第二个
public class S4 {

    public static ListNode oddEvenList(ListNode head) {
        final ListNode oddDummy = new ListNode(0);
        final ListNode evenDummy = new ListNode(0);

        ListNode odd = oddDummy;
        ListNode even = evenDummy;

        int index = 1;
        while (head != null) {
            if (index % 2 == 1) {
                odd.next = head;
                odd = odd.next;
            }
            else {
                even.next = head;
                even = even.next;
            }

            ListNode tmp = head.next;
            head.next = null;
            head = tmp;
            ++index;
        }

        odd.next = evenDummy.next;
        return oddDummy.next;
    }


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        S1 s = new S1();
        System.out.println(s.printListFromTailToHead(oddEvenList(listNode)));
    }
}
