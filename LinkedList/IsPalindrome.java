package LinkedList;

import java.util.List;

public class IsPalindrome {
    private ListNode head;
    private int size;

    public static void main(String[] args) {
        IsPalindrome p = new IsPalindrome();
        p.insertFirst(1);
        p.insertFirst(2);
        p.insertFirst(2);
        p.insertFirst(1);
        System.out.println("Is it palindrome : " + p.isPalin(p.head));
    }

    public void insertFirst(int value) {
        ListNode newnode = new ListNode(value);
        newnode.next = head; // it points to the head of the next occurring node
        head = newnode;// now the head references to the new newnode
        size += 1;
    }

    //for middle node identification
    public ListNode midEle(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //for reversing the LL
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalin(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid = midEle(head);
        ListNode headSecond = reverseList(mid);//reversing the list from the mid-element
        ListNode p2 = headSecond;
        boolean isPal = true;
        while (headSecond != null) {//until the second head reaches null we traverse for comparison
            if (head.val != headSecond.val) {
                isPal = false;
                break;
            }
            head = head.next;//move pointers
            headSecond = headSecond.next;
        }
        reverseList(p2);//re-reverse the linked for original structure
        display();
        return isPal;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
