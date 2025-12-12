package StacksAndQueues;

public class CustomQueue {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);//points to the contructor with size parameter
    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(11);
        queue.remove();
        queue.display();

    }

    public boolean insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        } else {
            //insertion at rear i.e. at end
            data[end] = item;
            end++;
            return true;
        }
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            int removed = data[0];
            //shift the elements after the removal from the front
            //Complexity : O(n)
            for (int i = 1; i < end; i++) {
                data[i - 1] = data[i];
            }
            end--;
            return removed;
        }
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
