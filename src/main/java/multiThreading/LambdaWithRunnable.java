package multiThreading;

public class LambdaWithRunnable {

    public static void main(String[] args) throws InterruptedException {


        //Using Lambda Function
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        System.out.println("***Priorities of threads");
        System.out.println("t1 : " + t1.getPriority());
        System.out.println("t2 : " + t2.getPriority() + "\n");


        //10 - max priority, 5-normal priority, 1-min priority
        t1.setPriority(1);
        t2.setPriority(10);

        Thread.sleep(1000);
        System.out.println("After setting priorities");
        System.out.println("t1 : " + t1.getPriority());
        System.out.println("t2 : " + t2.getPriority() + "\n");

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t1.setPriority(Thread.MIN_PRIORITY); // 1

        // Thread.NORM_PRIORITY = 5

        t1.start();

        Thread.sleep(10);

        t2.start();



        //join() methods waits the main thread until t1 and t2 completely executes
        t1.join();
        t2.join();

        System.out.println("***Thread Names");
        //prints the Thread name
        System.out.println(t1.getName());
        System.out.println(t2.getName() + "\n");

        t1.setName("Hi Thread");
        t2.setName("Hello Thread");

        System.out.println("\n" + "After Changing the names of threads");

        System.out.println(t1.getName());
        System.out.println(t2.getName() + "\n");

        // If we didn't give join methods for t1 and t2, then main thread continues
        // to work with t1 and t2 and this *end* prints somewhere in between these threads.

        //isAlive is a boolean datatype which gives the status of the t1 and t2 thread
        System.out.println(t2.isAlive());
        System.out.println(t1.isAlive() + "\n");

        //As we have said to main thread to wait until t1 and t2 joins
        System.out.println("end");


    }
}

class Hi_R_L implements Runnable{


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
        System.out.println("\n");
    }
}

class Hello_R_L implements Runnable{

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
        System.out.println("\n");
    }
}