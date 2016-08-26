package round1.tree;

/**
 * Given a binary tree, find its maximum depth.
 * <p/>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p/>
 * Created by xingfeiy on 6/24/16.
 */
public class MaximumDeepOfTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
