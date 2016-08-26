package round1.linkedlist;

/**
 * Reverse a singly linked list.
 * Created by xingfeiy on 6/29/16.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }

        return preNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
