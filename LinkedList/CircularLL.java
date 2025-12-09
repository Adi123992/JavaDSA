package LinkedList;

public class CircularLL {
    Node head;
    Node tail;

    public static void main(String[] args) {
        CircularLL c = new CircularLL();
        c.insert(10);
        c.insert(20);
        c.insert(30);
        c.insert(40);
        c.insert(66);
        c.delete(10);
        c.display();
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int value) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            if (head == null) { // list became empty
                tail = null;
            }
            tail.next = head;
            return;
        }
        if (head != null) {
            do {
                Node n = temp.next;
                if (n.value == value) {
                    temp.next = n.next;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
        }
    }

    public void display() {
        Node node = head;
        if (head != null) {//only if there is an element in an LL this will go for execution
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);//this gives the circular LL till the last tail element
        }
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
