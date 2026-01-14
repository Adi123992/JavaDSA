package LinkedList;

//this approach is according to the leetcode, instead of the entire LL here we just return the node and the LL is printed internally in LeetCode
public class MiddleElement {
    private Node head;
    private Node tail;
    private int size;

    public MiddleElement() {
        this.size = 0;
    }

    public static void main(String[] args) {
        MiddleElement m = new MiddleElement();
        m.insertLast(10);
        m.insertLast(20);
        m.insertLast(30);
        m.insertLast(40);
        m.insertLast(50);
        m.display();
        int mval = m.getMid();
        System.out.println();
        System.out.println("The middle element is : " + mval);
    }

    public static Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");

    }

    public int getMid() {
        Node middle = getMiddle(head);
        return middle.val;
    }

    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head; // it points to the head of the next occurring node
        head = newnode;// now the head references to the new newnode

        if (tail == null) {
            tail = newnode; // the tail variable now references to the newnode if the node is the one and only
        }
        size += 1;
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
