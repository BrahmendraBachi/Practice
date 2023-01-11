package multiThreading;

public class SynchronisedImplementation {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run() {
                for(int i = 0; i < 1000; i ++){
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 1000; i++){
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();

        //Here we are starting both the threads at the same time which has a problem when these
        //hits the increment at a same time.

        //As we have synchronised the method now only one thread can trigger the method.

        t1.join();
        t2.join();

        System.out.println(counter.count);

    }
}


class Counter{

    int count;

    // This synchronized key word make sures that only one thread can communicate at a same time
    public synchronized void increment() {
        count++;
    }
}