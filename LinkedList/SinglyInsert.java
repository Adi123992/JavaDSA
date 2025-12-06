package LinkedList;

public class SinglyInsert {
    private Node head;
    private Node tail;
    private int size;

    public SinglyInsert(int size) {
        this.size = 0;
    }


    //insertion at start of the LinkedList
    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head; // it points to the head of the next occurring node
        head = newnode;// now the head references to the new newnode

        if (tail == null) {
            tail = newnode; // the tail variable now references to the newnode if the node is the one and only
        }
        size += 1;
    }

    //insertion at the end of LinkedList
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

    //insertion at a position
    public void insertPosition(int value, int index) {
        if (index == 0) {//first node
            insertFirst(value);
            return;
        }
        if (index == size) {//lastnode
            insertLast(value);
            return;
        }
        Node temp = head;//create a temp reference variable which is a duplicate of head reference variable as we cannot update the head varaible since the head is fixed to be the first element and hence for traversing we create a duplicate reference variable of the head reference variable and use it for finding position to insert the element
        for (int i = 1; i < index; i++) {// reach to the element before the index position
            temp = temp.next;// we transfer the head reference mimicked by the temp varaible as by shifiting till the index -1 postion so that we can use it for the insertion in that particular position
        }
        Node newnode = new Node(value, temp.next);// now creating a new node where we take the temp.next pointer node from the temp reference variable so that this newly inserted element actually points to the node that was after the pre-existing node so the list continues
        //here newnode.next = temp.next
        temp.next = newnode;// the node existing in the previous index now points to the new node thats it
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

    //find the node via the value
    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;//if the value matches the reference variable return it
            }
            temp = temp.next;//if not matched then point to the next node
        }
        return null;// return null if not found
    }

    private class Node {
        private int value;
        private Node next;//by default when create the value for this reference variable is "null"

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
