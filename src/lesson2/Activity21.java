package lesson2;

import java.util.Scanner;

public class Activity21
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Input first number : ");
        a = sc.nextInt();
        System.out.print("Input second number: ");
        b = sc.nextInt();
        System.out.println( a + " + " + b + " = " + (a+b) );
        System.out.println( a + " - " + b + " = " + (a-b) );
        System.out.println( a + " x " + b + " = " + (a*b) );
        System.out.println( a + " / " + b + " = " + (a/b) );
        System.out.println( a + " mod " + b + " = " + (a%b) );
    }
}
