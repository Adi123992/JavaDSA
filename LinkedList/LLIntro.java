package LinkedList;

public class LLIntro {
    private Node head;
    private Node tail;
    private int size;

    public LLIntro(int size) {
        this.size = 0;
    }

    public static void main(String[] args) {
        LLIntro l = new LLIntro(5);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(37);
        l.insertLast(77);
        l.insertPosition(33, 3);
        l.display();

    }

    //insertion at start of the LinkedList
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }
        size += 1;
    }

    //insertion at the end of LinkedList
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size += 1;
    }

    //insertion at a position
    public void insertPosition(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
