package lesson4.rectanglemanagement;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat(),height = sc.nextFloat();
        Rectangle aBCD= new Rectangle(width,height);
        aBCD.writeWandH();
        System.out.println("Perimeter: " + aBCD.calP() );
        System.out.println("Area :" + aBCD.calS());
        if(aBCD.check())
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");
    }
}
