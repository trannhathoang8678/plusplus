package threadtest;

public class DemoSynchronized {

    public static synchronized void commonSourse()
    {
        int cnt = 0;
        for(int i = 1 ; i < 100 ; i++)
        {
            System.out.println(i);
        }
    }
}
