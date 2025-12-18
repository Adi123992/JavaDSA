package OOPS.Threads;

//class A1 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

class B2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        //Anonymous inner class as the Runnable interface has only 1 method we can use this over here reducing the space of creating a separate class
        
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = new B2();

        Thread t1 = new Thread(obj1); // Thread has a constructor that takes Runnable objects as parameter
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
