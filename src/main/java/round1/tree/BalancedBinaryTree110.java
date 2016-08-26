package round1.tree;

/**
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of
 every node never differ by more than 1.
 * Created by xingfeiy on 6/30/16.
 */
public class BalancedBinaryTree110 {
    /**
     * Start Time: 2:06PM
     * First submit: 2:14PM, failed due to didn't understand the question, please notes the key words "more than 1".
     *
     * Start again: 2:15PM, try to understand question first, what is the depth of the two subtrees?
     *
     * I think there is a misunderstand in the question, I guess this guy questioned AVL trees.
     * http://software.ucv.ro/~mburicea/lab6ASD.pdf
     *
     * Here are some important notions:
     * [1] The lenght of the longest road from the root node to one of the terminal nodes is what we call the
     * height of a tree.
     * [2] The difference between the height of the right subtree and the height of the left subtree is what we
     * call the balancing factor.
     * [3] The binary tree is balanced when all the balancing factors of all the nodes are -1,0,+1.
     *
     * Finally, got understanding what is AVL tree.
     * http://cs.stackexchange.com/questions/47175/avl-trees-height-balance-property
     * The balance property of AVL trees is defined in terms of the "balance factor", which is calculated as
     * balance factor = height(left sub tree) - height(right sub tree)
     *
     * Start Again: 7:16PM
     * Finish it at 7:31PM, elapsed 15 mins, not good
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        if(!isBalanced(root.left)) {
            return false;
        }
        return isBalanced(root.right);
    }

    private int getHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left, right) + 1;
    }
}
