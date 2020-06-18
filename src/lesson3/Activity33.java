package lesson3;

import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        long n = sc.nextLong();
        String s="";
        int count=0;
        while (n > 0)
        {
            count++;
            if(n%2==0)
                s = '0' + s;
            else
                s= '1'+s;
            n /= 2;
        }
        System.out.print(s);
    }
}
