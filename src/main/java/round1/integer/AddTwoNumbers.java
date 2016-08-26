package round1.integer;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each
 * of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p/>
 * Created by xingfeiy on 12/8/15.
 */
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return null;
        }

        ListNode headNode = null;
        ListNode preNode = null;
        int extraAdd = 0;
        while (l1 != null || l2 != null || extraAdd > 0) {
            int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + extraAdd;
            extraAdd = val > 9 ? 1 : 0;
            val = (val > 9) ? (val - 10) : val;
            ListNode curNode = new ListNode(val);
            if(headNode == null) {
                headNode = curNode;
            }
            if(preNode != null) {
                preNode.next = curNode;
            }
            preNode = curNode;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return headNode;
    }

    public static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
//        ListNode l23 = new ListNode(4);
//        l22.next = l23;


        ListNode node = new AddTwoNumbers().addTwoNumbers(l11, l21);
        do{
            System.out.println(node.val);
            node = node.next;
        } while (node != null);
    }
}
