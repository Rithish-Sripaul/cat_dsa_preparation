package binarySearchTree;

class bst {
    Node root = null;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        return root;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }
}

class Node {
    int data;
    Node left, right;

    Node (int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class Main {
    public static void main(String[] args) {

        bst b = new bst();
        b.insert(12);
        b.insert(10);
        b.insert(1);
        b.insert(100);
        b.inOrder();
    }
}
