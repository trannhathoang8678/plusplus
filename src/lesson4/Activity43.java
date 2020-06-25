package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array: n = ");
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter elements of the 1st array:");
        for(int i = 0 ; i < n; i++)
        {
            System.out.print("a[" + i + "] = " );
            int x = sc.nextInt();
            array.add(x);
        }
        System.out.print("Enter the size of the 2nd array: n = ");
        int m = sc.nextInt();
        System.out.println("Enter elements of the 1st array:");
        for(int i = n ; i < n+m; i++)
        {
            System.out.print("b[" + (i-n+1) + "] = " );
            int x = sc.nextInt();
            array.add(x);
        }
        System.out.println("Original array: ");
        System.out.print("Length = " + n +"; elements = ");
        for(int i = 0 ; i < n ; i++)
            System.out.print(array.get(i) + " ");
        System.out.println();
        System.out.print("Length = " + m +"; elements = ");
        for(int i = n ; i < n+m; i++)
            System.out.print(array.get(i) + " ");
        System.out.println();
        System.out.println("Merged array: ");
        System.out.print("Length = " + (m+n) +"; elements = ");
        for(int i = 0 ; i < (m+n) ;i++)
            System.out.print(array.get(i) + " ");
    }
}
