package BinaryTrees.AVLTrees;

public class AVLTrees {
    private Node root;

    public AVLTrees() {

    }

    public int height() {
        return getHeight(root);
    }

    //return the height of the node if node == null it returns -1 because the height at the leaf node is already 0
    public int getHeight(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    //inserts the value via helper function
    public void insert(int val) {
        root = insert(val, root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    //first create a function and then a helper function within it to understand more
    public boolean balanced() {
        return balanced(root);
    }

    //helper function
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        //not only calculates for the root nodes but also checks the height diff of subtrees to avoid errors
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    //helper function of insert
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
        return rotate(node);
    }

    //AVL rotate
    public Node rotate(Node node) {
        //left heavy
        if (getHeight(node.left) - getHeight(node.right) > 1) {
            //left - left case
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                return rightRotate(node);
            }
            //left - right case
            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //right heavy
        if (getHeight(node.left) - getHeight(node.right) < -1) {
            //right - right case
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                return leftRotate(node);
            }
            //left - right case
            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        // p - parent node, c - child node , t - child.right
        Node c = p.left;
        Node t = c.right;
        //make changes according to the rotation diagram no intuition just diagram implementation
        c.right = p;
        p.left = t;
        //since p comes below c now so update height of p first and then c
        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;
        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
        //since now the c is below p so update the height of c first and then p
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;
        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;

        return p;
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
