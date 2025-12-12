package StacksAndQueues;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);//points to the contructor with size parameter
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(7);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        // stack.push(80);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();

    }

    public int push(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full ");
        }
        ptr++;
        data[ptr] = value;
        return value;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        } else {
            return data[ptr--];

        }
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
