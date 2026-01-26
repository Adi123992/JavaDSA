package BinaryTrees.Introduction;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    private static void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter in the left of " + node.value);
        boolean ans = sc.nextBoolean();
        if (ans) {
            System.out.println("Enter val to be entered in left ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter in the right of " + node.value);
        boolean ans1 = sc.nextBoolean();
        if (ans1) {
            System.out.println("Enter val to be entered in right ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void populate() {
        System.out.println("Enter the root node :");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    public void getRoot() {
        System.out.println(this.root.value);
    }

    public void display() {
        display(this.root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
