package Test;

public class MultiThreading extends Thread{

    @Override
    public void run()
    {
        for(int i =0; i < 5; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
