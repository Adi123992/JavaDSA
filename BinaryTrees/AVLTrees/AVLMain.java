package BinaryTrees.AVLTrees;

public class AVLMain {
    public static void main(String[] args) {
        AVLTrees avl = new AVLTrees();
        for (int i = 0; i < 1000; i++) {
            avl.insert(i);
        }
        System.out.println(avl.height());
    }
}
