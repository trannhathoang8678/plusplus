package lesson3;

import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        long n = sc.nextLong();
        boolean binarynumber[]= new boolean[66];
        int count=0;
        while (n > 0)
        {
            count++;
            if(n%2==0)
                binarynumber[count]=false;
            else
                 binarynumber[count]=true;
            n /= 2;
        }
        for(int i = count; i >= 1; i--)
            if(binarynumber[i])
                System.out.print(1);
            else
                System.out.print(0);
    }
}
