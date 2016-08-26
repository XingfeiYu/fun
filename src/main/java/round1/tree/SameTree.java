package round1.tree;

/**
 * Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

 * Created by xingfeiy on 6/23/16.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == q) {
            return true;
        }

        if(p == null || q == null) {
            return false;
        }

        if(p.val != q.val) {
            return false;
        }

        if(!isSameTree(p.left, q.left)) {
            return false;
        }

        return isSameTree(p.right, q.right);
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
