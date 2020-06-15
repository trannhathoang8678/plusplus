package lesson2;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        long n = sc.nextLong(),thenumberof10_n=1;
        short fake_n=(short)n;
        while(fake_n > 0)
        {
            thenumberof10_n*=10;
            fake_n/=10;
        }
        long nn=n*thenumberof10_n+n,nnn=nn*thenumberof10_n+n;
        System.out.println(n + " + " + nn + " + " + nnn + " = " + (n + nn + nnn) );
    }
}
