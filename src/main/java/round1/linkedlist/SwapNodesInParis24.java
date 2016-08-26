package round1.linkedlist;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * Created by xingfeiy on 7/7/16.
 */
public class SwapNodesInParis24 {
    /**
     * Start Time: 4:24PM
     * End Time: 4:43PM, accepted but not good, should think about better solution.
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode newHead = null;
        while (curNode != null && curNode.next != null) {
            ListNode tmpNext = curNode.next;
            curNode.next = curNode.next.next;
            tmpNext.next = curNode;
            if(preNode != null) {
                preNode.next = tmpNext;
            } else {
                newHead = tmpNext;
            }
            preNode = curNode;
            curNode = curNode.next;
        }
        return newHead;
    }
}
