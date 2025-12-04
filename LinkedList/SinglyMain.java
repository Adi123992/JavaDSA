package LinkedList;

public class SinglyMain {
    public static void main(String[] args) {
        SinglyInsert l = new SinglyInsert(5);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(37);
        l.insertLast(77);
        l.insertPosition(33, 3);
        l.display();
    }
}
