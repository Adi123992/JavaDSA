package BinaryTrees.Introduction;

public class Main {
    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        bt.populate();
//        bt.getRoot();
//        bt.prettyDisplay();

        BST tree = new BST();
        int[] nums = {5, 2, 10, 15, 3, 1, 12};
        tree.populate(nums);
        tree.display();
    }
}
