package round1.linkedlist;

/**
 * Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?

 * Created by xingfeiy on 6/29/16.
 */
public class LinkedListCycle {
    /**
     * Start Time: 2:52PM
     * End Time: 2:57PM, have no idea, get help from internet.
     * Check: https://en.wikipedia.org/wiki/Cycle_detection#Tortoise_and_hare
     *
     * Start it again: 8:43PM
     * Done: 8:49PM
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode slowPoint = head;
        ListNode fastPoint = head.next;
        while (fastPoint != null && fastPoint.next != null) {
            if(fastPoint == slowPoint) {
                return true;
            }
            fastPoint = fastPoint.next.next;
            slowPoint = slowPoint.next;
        }
        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
