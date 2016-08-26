package round1.linkedlist;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes
 * of the first two lists.
 * Created by xingfeiy on 6/29/16.
 */
public class MergeOrderedLists21 {
    /**
     * Start Time: 8:53PM
     * Didn't finish it in 20 mins, failed.
     *
     * Start it again: 9:30PM
     * Didn't finish it in 10 mins, failed.
     *
     * Finally, get it done after got some hints from internet, the key point is create a fake head, and return head.next
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode pointer = head;
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                pointer.next = l1;
                pointer = l1;
                l1 = l1.next;
            } else {
                pointer.next = l2;
                pointer = l2;
                l2 = l2.next;
            }
        }

        if(l1 == null) {
            pointer.next = l2;
        } else {
            pointer.next = l1;
        }

        return head.next;
    }
}
