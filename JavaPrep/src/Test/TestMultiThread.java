package Test;

public class TestMultiThread extends Thread {
    public synchronized void myMultiMethod()
    {
        for(int i =0; i < 5;i++)
        {
            System.out.println(i + "From Thread"+TestMultiThread.currentThread());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run()
    {
      myMultiMethod();
    }

}

class childThread
{
    public static void main(String[] args) {
        TestMultiThread m1 = new TestMultiThread();
        TestMultiThread m2 = new TestMultiThread();
        m1.start();
        m2.start();

    }
}

class lockThread
{
    public static void main(String[] args) {
        TestMultiThread m1 = new TestMultiThread();
        Thread t1 = new Thread(m1::myMultiMethod,"Thread 1");
        Thread t2 = new Thread(m1::myMultiMethod,"Thread 2");

        t1.start();
        t2.start();

    }
}
