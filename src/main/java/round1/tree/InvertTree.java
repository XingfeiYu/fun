package round1.tree;

/**
 * Created by xingfeiy on 6/23/16.
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public TreeNode invertTreeV2(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode left = invertTreeV2(root.left);
        TreeNode right = invertTreeV2(root.right);

        root.left = right;
        root.right = left;
        return root;
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
