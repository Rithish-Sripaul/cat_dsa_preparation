package binaryTree;

import java.util.Scanner;

class Tree {
    Node tree = createTree();

    Node createTree() {
        Node temp = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int data = sc.nextInt();
        sc.nextLine();

        if (data == -1) {
            return null;
        }

        temp = new Node(data);
        System.out.println("Enter left for " + data);
        temp.left = createTree();
        System.out.println("Enter right for " + data);
        temp.right = createTree();
        return temp;
    }

    void preOrder() {
        preOrderRec(tree);
    }

    void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
    }
}
