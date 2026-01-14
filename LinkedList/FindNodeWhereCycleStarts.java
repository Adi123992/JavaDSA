package LinkedList;

public class FindNodeWhereCycleStarts {
    private Node head;

    //cycle detection
    public static boolean containsCycle(FindNodeWhereCycleStarts node) {
        git fast = node.head;
        Node slow = node.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //cycle length
    public static Node cycleNode(FindNodeWhereCycleStarts node) {
        Node fast = node.head;
        Node slow = node.head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {

                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
            }
        }
        if (length == 0) {
            return null;
        }
        Node f = node.head;
        Node s = node.head;
        while (length > 0) {
            s = s.next;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
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
