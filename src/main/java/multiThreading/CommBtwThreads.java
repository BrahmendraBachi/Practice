package multiThreading;

public class CommBtwThreads {

    public static void main(String[] args) throws InterruptedException {

        Q q = new Q();
        int i = 0;
        new Producer(q);
        new Consumer(q);


    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            try {
                q.put(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{

    Q q;

    public Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Customer");
        t.start();
    }

    @Override
    public void run() {
        while (true){
            try {
                q.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Q {

    int num;

    boolean valueSet = false;
    synchronized void put(int num) throws InterruptedException {

        while (valueSet){

            // wait() method will wait until it get notify() method is called
            wait();
        }

        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        //This activates the thread
        notify();
    }

    synchronized void get() throws InterruptedException {

        while (!valueSet){
            wait();
        }
        valueSet = false;
        System.out.println("Get : " + this.num);
        notify();
    }

}