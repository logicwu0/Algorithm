import java.util.ArrayList;
/**
 *
 *
 *
 * */

public class S1 {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public  ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        if (listNode != null)
        {
            //this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.data);
            this.printListFromTailToHead(listNode.next);
        }
        return arrayList;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(0);
        S1 s = new S1();
        System.out.println(s.printListFromTailToHead(listNode));
    }

}
