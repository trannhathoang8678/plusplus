package lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Activity44 {
    private void find(int[] array)
    {
        int ma1 = -2000000000,mi1 = 2000000000;
        int ma2 = ma1,mi2 = mi1,vti1 = 0, vti2 = 0, vta1 = 0, vta2 = 0;
        for(int i = 0 ; i < array.length; i++)
        {
            if(array[i] > ma2)
            {
                if(array[i] > ma1)
                {
                    ma2 = ma1;
                    vta2 = vta1;
                    ma1 = array[i];
                    vta1 = i;

                }
                else
                {
                    ma2 = array[i];
                    vta2 = i;
                }
            }

            if(array[i] < mi2) {
                if (array[i] < mi1) {
                    mi2 = mi1;
                    vti2 = vti1;
                    mi1 = array[i];
                    vti1 = i;
                } else {
                    mi2 = array[i];
                    vti2 = i;
                }
            }

        }
        System.out.println("Maximum: " + ma1 + " Position: " + vta1 + " " + "2ndMaximum: " + ma2+ " Position: " + vta2);
        System.out.println("Minimum: " + mi1 + " Position: " + vti1 + " " + "2ndMinimum: " +mi2+ " Position: " + vti2);
    }
    private void changenegative(int[] array)
    {
        for(int i = 0; i < array.length ; i++)
            if(array[i] < 0) array[i] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: n = ");
        int n = sc.nextInt();
        int[] array = new int [n];
        System.out.println("Enter elements of the array:");
        for(int i = 0 ; i < n; i++)
        {
            System.out.print("a[" + i + "] = " );
            int x = sc.nextInt();
            array[i] = x;
        }
        Activity44 Act44 = new Activity44();
        Act44.find(array);
        Act44.changenegative(array);
        Arrays.sort(array);
        for(int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }


}
