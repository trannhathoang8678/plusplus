package lesson4;

import java.util.Scanner;

public class Activity45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Reverse of that string is: ");
        for(int i = s.length() -1 ; i >= 0 ; i--)
            System.out.print(s.charAt(i));

    }
}
