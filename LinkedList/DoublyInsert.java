package LinkedList;

public class DoublyInsert {
    Node head;

    public static void main(String[] args) {
        DoublyInsert dl = new DoublyInsert();
        dl.insertFirst(7);
        dl.insertFirst(8);
        dl.insertFirst(9);
        dl.insertFirst(10);
        dl.insertFirst(11);
        dl.insertAfter(9, 69);
        dl.insertLast(15);
        dl.insertLast(22);
        dl.display();
        dl.displayRev();
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        Node last = head;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.next = null;
        newNode.prev = last;
    }

    //find the node via the value
    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;//if the value matches the reference variable return it
            }
            temp = temp.next;//if not matched then point to the next node
        }
        return null;// return null if not found
    }

    //kind of different from the SinglyInsert implementation since we want to explore more methods and techniques
    public void insertAfter(int afterval, int newval) {
        Node prevNode = find(afterval);//find the value after which we need to insert the new node
        if (prevNode == null) {
            System.out.println("Doesnt exist");
            return;
        }
        Node newNode = new Node(newval);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;//this may cause null pointer exception as the insertion may be at the last position and hence the node after the position may be null and we cannot assign a null's prev as a node as it isnt a node as such .
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void displayRev() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("End");
        System.out.println();
    }


    private class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
