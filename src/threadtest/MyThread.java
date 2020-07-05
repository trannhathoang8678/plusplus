package threadtest;

public class MyThread extends Thread {
    @Override
    public void run()
    {
        DemoSynchronized.commonSourse();
    }
}
