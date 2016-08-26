package round1.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as

 the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

 * Created by xingfeiy on 7/1/16.
 */
public class LowestCommonAncestor235 {

    public TreeNode betterSolution(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) {
            return null;
        }

        if(p.val < root.val && q.val < root.val) {
            return betterSolution(root.left, p, q);
        } else if(p.val > root.val && q.val > root.val) {
            return betterSolution(root.right, p, q);
        }
        return root;
    }

    /**
     * Start Time: 2:10PM
     * Submit Time: 2:21PM, failed, the implementation of pathNodes is wrong.
     *
     * Stupid implementation!!!
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) {
            return null;
        }

        List<TreeNode> pNodes = pathNodes(root, p);
        List<TreeNode> qNodes = pathNodes(root, q);
        for(int i = 0; i < pNodes.size() - 1; i++) {
            for(int j = 0; j < qNodes.size() - 1; j++) {
                if(pNodes.get(i) == qNodes.get(j)) {
                    return pNodes.get(i);
                }
            }
        }
        return root;
    }

    private List<TreeNode> pathNodes(TreeNode start, TreeNode node) {
        if(start == null) {
            return Collections.EMPTY_LIST;
        }
        List<TreeNode> path = new ArrayList<>();
        if(start.val < node.val) {
            path.addAll(pathNodes(start.right, node));
        } else if(start.val > node.val) {
            path.addAll(pathNodes(start.left, node));
        }
        path.add(start);
        return path;
    }

    /**
     * Wrong
     * @param start
     * @param node
     * @return
     */
//    private List<TreeNode> pathNodes(TreeNode start, TreeNode node) {
//        if(start == null) {
//            return null;
//        }
//
//        List<TreeNode> path = new ArrayList<>();
//        if(start.val == node.val) {
//            path.add(start);
//            return path;
//        } else if(start.val < node.val) {
//            List<TreeNode> list = pathNodes(start.right, node);
//            if(list != null) {
//                path.addAll(list);
//            }
//        } else {
//            List<TreeNode> list = pathNodes(start.left, node);
//            if(list != null) {
//                path.addAll(list);
//            }
//        }
//
//        return path;
//    }
}
