package LinkedList;

public class MergeTwoSortedLL {
    private Node head;
    private int size;
    private Node tail;

    public MergeTwoSortedLL() {
        this.size = 0;
    }

    public static void main(String[] args) {
        MergeTwoSortedLL first = new MergeTwoSortedLL();
        MergeTwoSortedLL second = new MergeTwoSortedLL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(12);
        MergeTwoSortedLL ans = mergeLL(first, second);
        ans.display();


    }

    private static MergeTwoSortedLL mergeLL(MergeTwoSortedLL first, MergeTwoSortedLL second) {
        MergeTwoSortedLL ans = new MergeTwoSortedLL();
        Node h1 = first.head;
        Node h2 = second.head;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                ans.insertLast(h1.val);
                h1 = h1.next;
            } else {
                ans.insertLast(h2.val);
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            ans.insertLast(h1.val);
            h1 = h1.next;
        }
        while (h2 != null) {
            ans.insertLast(h2.val);
            h2 = h2.next;
        }
        return ans;
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
