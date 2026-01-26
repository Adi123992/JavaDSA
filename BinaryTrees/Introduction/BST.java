package BinaryTrees.Introduction;

public class BST {
    private Node root;

    public BST() {

    }

    public int getHeight(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            Node n = new Node(val);
            return n;
        }

        if (val < node.value) {
            node.left = insert(val, node.left);
        }
        if (val > node.value) {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public void display() {
        display(root, "Root Node : ");
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " is : ");
        display(node.right, "Right child of " + node.value + " is : ");
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
    }
}
