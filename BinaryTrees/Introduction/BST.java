package BinaryTrees.Introduction;

public class BST {
    private Node root;

    public BST() {

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

    //if the arr is sorted then take the middle of array and then build a tree
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (nums.length == 0) {
            return;
        }
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        insert(nums[mid]);
        //left arr
        populateSorted(nums, start, mid);
        //right arr
        populateSorted(nums, mid + 1, end);
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
