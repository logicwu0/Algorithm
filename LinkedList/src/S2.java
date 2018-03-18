

/**
 * 遍历链表
 * 输入链表的长度
 * */
public class S2 {

    public static int ListLength(ListNode listNode) {
        int length = 0;
        ListNode currentNode = listNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(17);
        listNode.next.next.next = new ListNode(4);

        System.out.println(ListLength(listNode));
    }

}
