package StacksAndQueues;

public class DynamicStack extends CustomStack {
    public DynamicStack(int size) {
        super(size);
    }

    public DynamicStack() {
        super();
    }

    public static void main(String[] args) throws Exception {
        CustomStack ds = new DynamicStack(5);
        ds.push(11);
        ds.push(12);
        ds.push(13);
        ds.push(14);
        ds.push(15);
        ds.push(16);
        ds.display();
        System.out.println();
        System.out.println(ds.pop());
    }

    @Override
    public int push(int value) throws Exception {
        if (isFull()) {
            int[] temp = new int[data.length * 2]; // create an array of double the size
            //now copy all the elements to the new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //now if the array was full the size has been doubled and if not still we are now ready to perform the same push operation from the CustomStack as such
        return super.push(value);
    }
}
