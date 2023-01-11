package multiThreading;

public class MultiThreadingDemo {

    // By default, main is a thread and its started
    public static void main(String[] args) throws InterruptedException {

        //Prints the main Thread
        System.out.println("Main Thread : " + Thread.currentThread());


        // creates a new Thread
        System.out.println(" ***Thread in multiThreading1");
        System.out.println(" ***Thread in multithreading2");

        MultiThreading multiThreading1 = new MultiThreading();
        MultiThreading multiThreading2 = new MultiThreading();

        //Both threads start at the same time and does the operation
        multiThreading1.start();
        multiThreading2.start();

        //This sleeps the main thread up to 5sec to execute the above functionalities
        Thread.sleep(5000);

        //These are the two objects of the two different class which are running with two different threads
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        //This starts the thread which is in class Hi
        obj1.start();

        //Thread sleeps 10sec to prevent the starting of both threads in same time
        Thread.sleep(10);
        obj2.start();

        //make sure that we have used 5 threads in this program where

    }

}

class Hi extends Thread{

    public void run(){
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

class Hello extends Thread{
    public void run(){
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

class MultiThreading extends Thread{

    @Override
    public void run(){

        System.out.println("Thread : " + Thread.currentThread());
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}



