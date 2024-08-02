package Test;

public class MultiThread {


    public static void main(String[] args) {


        MultiThreading mt = new MultiThreading();
        MultiThreading mt1 = new MultiThreading();

        mt.start();
        mt1.start();

    }
}
