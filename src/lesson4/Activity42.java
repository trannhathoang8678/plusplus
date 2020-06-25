package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {
        Map<Integer, Boolean> hashMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: n = ");
        int n = sc.nextInt(),cnt = 0;
        int[] array = new int [n],origin = new int[n];
        System.out.println("Enter elements of the array:");
        for(int i = 0 ; i < n; i++)
        {
            System.out.print("a[" + i + "] = " );
            int x = sc.nextInt();
            origin[i] = x;
            if(!hashMap.containsKey(x))
            {
                array[cnt] = x;
                cnt++;
                hashMap.put(x,true);
            }
        }
        System.out.println("Original array: ");
        System.out.print("Length = " + n +"; a[] = ");
        for(int i = 0 ; i < n ; i++)
            System.out.print(origin[i] + " ");
        System.out.println();
        System.out.println("Array after remove all duplicate elements: ");
        System.out.print("Length = " + cnt +"; a[] = ");
        for(int i = 0 ; i < cnt ;i++)
            System.out.print(array[i] + " ");

    }
}
