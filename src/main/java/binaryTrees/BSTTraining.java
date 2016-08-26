package binaryTrees;

/**
 * Created by xingfeiy on 6/23/16.
 */
public class BSTTraining {
    private Node root = null;

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value <= node.value) {
            node.left = insert(value, node.left);
        } else {
            node.right = insert(value, node.right);
        }
        return node;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    public boolean lookup(int value) {
        return lookup(value, root);
    }

    private boolean lookup(int value, Node node) {
        if(node == null) {
            return false;
        }

        if(node.value == value) {
            return true;
        } else if(value <= node.value) {
            return lookup(value, node.left);
        } else {
            return lookup(value, node.right);
        }
    }

    public void printPreOrder() {
        if(root == null) {
            return;
        }
        printPreOrder(root);
    }

    private void printPreOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + ", ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    
    public void printInOrder() {
        if(root == null) {
            return;
        }
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if(node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.value + ", ");
        printInOrder(node.right);
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node node) {
        if(node == null) {return;}
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + ", ");
    }
}
