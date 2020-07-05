package threadtest;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Thread guess1 = new Thread()
        {
            int cnt = 0;
            //intialization

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
                while(randonNumber != n);
                System.out.println("Guess right at: " + cnt + " with " + n);
            }
        };
        GuessNumberThread guess2 = new GuessNumberThread(n);
        guess1.start();
        guess2.start();
        sc.close();
    }
}