package OOPS.Threads;

class A extends Thread {
    //run() method is called when we call the start method of the class which is extended by Thread so eventaully a Thread
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);// thread priority
        //starting the thread so that they can execute run() function
        obj1.start();
        obj2.start();

    }
}
