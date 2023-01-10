package multiThreading;

public class MainMethod {

    public static void main(String[] args) {

        MultiThreading multiThreading1 = new MultiThreading();

        MultiThreading multiThreading2 = new MultiThreading();

        multiThreading1.start();
        multiThreading2.start();



    }
}
