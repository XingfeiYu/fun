package binaryTrees;

import round1.tree.SymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xingfeiy on 8/1/16.
 */
public class TreeTraversal {
    private static Node root = new Node(4);
    static {
        Node left1 = new Node(6);
        Node right1 = new Node(5);
        root.left = left1;
        root.right = right1;

        Node left2 = new Node(3);
        Node right2 = new Node(1);
        left1.left = left2;
        left1.right = right2;

        Node left3 = new Node(7);
        Node right3 = new Node(9);
        right1.left = left3;
        right1.right = right3;
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void bfs(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node head = queue.poll();
            System.out.print(head.value + " ");
            if(head.left != null) {
                queue.add(head.left);
            }
            if(head.right != null) {
                queue.add(head.right);
            }
        }
    }

    public static void main(String[] args) {
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        bfs(root);
    }
}
