package threadtest;
import java.lang.Math;

public class GuessNumberThread extends Thread {
    int guessNumber, cnt = 0;
    //intialization
    public GuessNumberThread(int guessNumber) {
        this.guessNumber = guessNumber;
    }
    public GuessNumberThread() {
    }
@Override
    public void run()
    {
        int randonNumber = -1;
        do
        {
             randonNumber = (int)(Math.random()*100 + 1);
            cnt++;
            System.out.println("Guess " + cnt + ":" + randonNumber);
        }
        while(randonNumber != guessNumber);
        System.out.println("Guess right at: " + cnt + " with " + guessNumber);
    }
}
