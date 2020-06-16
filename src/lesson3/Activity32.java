package lesson3;

import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input fibonacci lenght: ");
        int n = sc.nextInt();
        long firstfibo= 0,secondfibo=1,transfer;
        System.out.print(firstfibo + ", " + secondfibo);
        for(int i=3;i<=n;i++)
        {
            transfer = firstfibo;
            firstfibo += secondfibo;
            secondfibo = transfer;
                System.out.print(", " + (secondfibo+firstfibo));

        }
    }
}
