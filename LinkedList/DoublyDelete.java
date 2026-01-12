package LinkedList;

public class DoublyDelete {
    Node head;
    int size;

    public DoublyDelete() {
        this.size = 0;
    }

    public static void main(String[] args) {
        DoublyDelete dd = new DoublyDelete();
        dd.insertFirst(10);
        dd.insertFirst(20);
        dd.insertFirst(30);
        dd.insertFirst(40);
        dd.insertFirst(50);
//        int x = dd.deleteEnd();
//        int y = dd.deleteStart();
//        System.out.println("Deleted value : " + x + " and " + y);
        int x = dd.deletePos(3);
        System.out.println("Deleted element : " + x);
        dd.display();
    }

    //delete from start
    public int deleteStart() {
        if (head == null) return -1;
        int val = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        return val;

    }

    //delete from end
    public int deleteEnd() {
        if (head == null) return -1;
        if (head.next == null) {   // only one node
            int val = head.value;
            head = null;
            size--;
            return val;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        int val = last.value;
        last.prev.next = null;
        last.prev = null;
        size--;
        return val;
    }

    public Node findNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //delete from position
    public int deletePos(int pos) {
        if (pos < 1 || pos > size) return -1;
        Node currNode = findNode(pos);
        int val = currNode.value;
        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
        return val;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int val, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
