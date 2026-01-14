package LinkedList;

public class RecursiveInsertion {
    private Node head;
    private int size;

    public RecursiveInsertion() {
        this.size = 0;
    }

    public static void main(String[] args) {
        RecursiveInsertion ri = new RecursiveInsertion();
        ri.insertFirst(10);
        ri.insertFirst(20);
        ri.insertFirst(30);
        ri.insertFirst(40);
        ri.insertFirst(50);
        ri.display();
        System.out.println();
        ri.insertRec(88, 2);
        ri.display();
    }

    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head; // it points to the head of the next occurring node
        head = newnode;// now the head references to the new newnode

        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");

    }

    public void insertRec(int val, int index) {
        head = insertRecursive(val, index, head);
    }

    //insertion via recursion
    private Node insertRecursive(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);//the new node is being inserted in the index position and its next is assigned to the node existing at that place
            size++;
            return newNode;
        }
        //starts from the head itself and finally returns the head node itself
        node.next = insertRecursive(val, index - 1, node.next);// it fixes the problem of new node insertion pointer
        return node;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
