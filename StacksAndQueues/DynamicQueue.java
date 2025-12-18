package StacksAndQueues;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(int size) {
        super(size);
    }

    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int item) {
        if (this.isEmpty()) {
            int[] temp = new int[data.length * 2];//create the array of double size
            //copy the elements to the new array

            for (int i = 0; i < data.length; i++) {
                //we start storing from the front of the queue
                temp[i] = data[(front + i) % data.length];

            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
