package StacksAndQueues;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int front = 0;
    int end = 0;
    int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);//points to the contructor with size parameter
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(11);
        queue.remove();
        System.out.println(queue.size);
        queue.display();
        System.out.println();
        queue.insert(37);
        queue.display();

    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[front];
        front++;
        front = front % data.length;//to override the elements in a circular form we need to find the modulus
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    private void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        //we need to print the whole loop circle until it reaches the end via the help of remainder
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        } while (i != end);
    }

    public boolean isFull() {
        return size == data.length;//chrcks the fullness via size variable to prevent data loss by overriding the required elements
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
