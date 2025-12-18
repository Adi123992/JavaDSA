package OOPS.Threads;

//suppose 2 threads are working on a same method, so they can occur at exact same time and can cause loss of information and increase the chances of error in large data
//eg: we trying to withdraw 7k from a bank twice with a balance of 10k at exact same time so this causes
// RACE CONDITION
class Counter {
    int count;

    //synchronized only allow one thread to execute the function at a time
    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        };
        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        //this starts the thread to execute
        t1.start();
        t2.start();

        //this first completes the thread process and then return to the main method if not mentioned the process keeps up on executing simulatenously and the main method can be accessed with the concurrent changes noticed
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
