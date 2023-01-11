package multiThreading;

public class RunnableImplementation {

    public static void main(String[] args) throws InterruptedException {


        // Runnable is a functional interface which has only one method
        Runnable obj1 = new Hi_R();
        Runnable obj2 = new Hello_R();

        Thread t1 = new Thread(obj1);
        t1.start();
        Thread.sleep(10);
        Thread t2 = new Thread(obj2);
        t2.start();


    }
}

class Hi_R implements Runnable{


    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello_R implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}