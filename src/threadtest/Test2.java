package threadtest;

public class Test2 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        System.out.println(myThread1.getName() + ": " + myThread1.getState());
        System.out.println(myThread2.getName() + ": " + myThread2.getState());
    }
}
