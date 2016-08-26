package round1.tree;

/**
 * Created by xingfeiy on 7/25/16.
 */
public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }

        if((sum - root.val == 0) && root.left == null && root.right == null) {
            return true;
        }

        if(hasPathSum(root.left, sum - root.val)) {
            return true;
        }
        return hasPathSum(root.right, sum - root.val);

    }


}
