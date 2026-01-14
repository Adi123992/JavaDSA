package LinkedList;

public class DetectCycleAndCycLen {
    private Node head;

    //cycle detection
    public static boolean containsCycle(DetectCycleAndCycLen node) {
        Node fast = node.head;
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
    public static int containsCycle2(DetectCycleAndCycLen node) {
        Node fast = node.head;
        Node slow = node.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                int length = 0;
                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
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
