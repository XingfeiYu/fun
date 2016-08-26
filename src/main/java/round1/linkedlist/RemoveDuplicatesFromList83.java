package round1.linkedlist;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 * Created by xingfeiy on 6/29/16.
 */
public class RemoveDuplicatesFromList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slowPoint = head;
        ListNode fastPoint = head.next;
        while (fastPoint != null) {
            if(slowPoint.val != fastPoint.val) {
                slowPoint.next = fastPoint;
                slowPoint = fastPoint;
            } else {
                slowPoint.next = null;
            }
            fastPoint = fastPoint.next;
        }
        return head;
    }

    public ListNode betterSolution(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
