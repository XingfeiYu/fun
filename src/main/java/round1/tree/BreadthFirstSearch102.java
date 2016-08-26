package round1.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xingfeiy on 7/25/16.
 */
public class BreadthFirstSearch102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return Collections.emptyList();
        }

        List<TreeNode> nextLevel = new ArrayList<>();
        if(root.left != null) {
            nextLevel.add(root.left);
        }
        if(root.right != null) {
            nextLevel.add(root.right);
        }
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> rootLevel = new ArrayList<>();
        rootLevel.add(root.val);
        results.add(rootLevel);

        while (!nextLevel.isEmpty()) {
            List<Integer> levelRes = new ArrayList<>(nextLevel.size());
            List<TreeNode> tmpNodes = new ArrayList<>();
            for(TreeNode node : nextLevel) {
                levelRes.add(node.val);
                if(node.left != null) {
                    tmpNodes.add(node.left);
                }
                if(node.right != null) {
                    tmpNodes.add(node.right);
                }
            }
            results.add(levelRes);
            nextLevel = tmpNodes;
        }
        return results;
    }

}
