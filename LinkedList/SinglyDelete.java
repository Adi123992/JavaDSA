package LinkedList;

public class SinglyDelete {
    private Node head;
    private Node tail;
    private int size;

    public SinglyDelete(int size) {
        this.size = 0;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;//moving to the next node
        if (head == null) {
            tail = null;//means list is empty and tail must be also pointing to the only element that was being deleted hence we need to update tail varaible as well
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = getNode(size - 2);// get the reference pointer to the secondLast Node via the method
        int value = tail.value;// the value of deleted element which was the tail Node previously
        tail = secondLast;// now flag the secondLast Node as tail node after deletion : Move tail backward
        tail.next = null;// and flag the next reference as NULL : Remove last node
        size--;
        return value;
    }

    public int deletePos(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = getNode(index - 1);// get the reference of node previous to the element to be deleted
        int val = prev.next.value;// value of the next node after prev to be returned : Value of the deleted node
        prev.next = prev.next.next;// pointing the previous node to the node after the deleted node : Reseting the pointers after deletion

        size--;
        return val;
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

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
