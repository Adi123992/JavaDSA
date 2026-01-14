package LinkedList;

public class DuplicateNodeRemove {
    private Node head;
    private int size;
    private Node tail;

    public DuplicateNodeRemove() {
        this.size = 0;
    }

    public static void main(String[] args) {
        DuplicateNodeRemove ri = new DuplicateNodeRemove();
        ri.insertLast(1);
        ri.insertLast(1);
        ri.insertLast(2);
        ri.insertLast(3);
        ri.insertLast(4);
        ri.insertLast(4);
        ri.display();
        ri.removeDup();
        System.out.println();
        ri.display();
    }

    public void insertLast(int value) {
        if (tail == null) {// is the node is null it means the LinkedList is empty hence insertion occurs at beginning
            insertFirst(value);
            return;
        }
        Node newnode = new Node(value);//create a new node
        tail.next = newnode; // the last node's next variable now references to the newnode as the next element
        tail = newnode;// and then we update the tail variable to reference it to the last node i.e. newnode

        size += 1;
    }

    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head; // it points to the head of the next occurring node
        head = newnode;// now the head references to the new newnode
        if (tail == null) {
            tail = newnode;
        }
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

    public void removeDup() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
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
