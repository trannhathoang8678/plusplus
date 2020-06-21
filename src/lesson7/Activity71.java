package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Activity71 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>() ;
        System.out.print("Input list: ");
        for(int i = 0; i < 5;i++)
        {

            s = sc.next();
            arrayList.add(s);
        }
        System.out.print("String need to be added: ");
        s = sc.next();
        int position = sc.nextInt();
        arrayList.add(position,s);
        System.out.print(arrayList);

    }
}
