package LinkedList;

public class ReverseLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public ReverseLinkedList() {
        this.size = 0;
    }

    public static void main(String[] args) {
    }

    private Node reverseLL() {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //v2
    // ListNode prevNode = null;
    //        ListNode present = head;
    //        ListNode nextNode = null;
    //
    //        while(present!= null){
    //            nextNode = present.next;
    //            present.next = prevNode;
    //            prevNode = present;
    //            present = nextNode;
    //            if(nextNode!=null){
    //            nextNode = nextNode.next;
    //            }
    //        }
    //        return prevNode;

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
