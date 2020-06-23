package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity81 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        for(int i = 0 ; i < n; i++)
        {
            int x = sc.nextInt();
            arrayList.add(x);
        }
        n = sc.nextShort();
        for(int i = 0 ; i < n; i++)
        {
            String s = sc.next();
            if (s.equals("Insert"))
            {
                int position = sc.nextInt(), res= sc.nextInt();
                arrayList.add(position,res);
            }
            else
            {
                int position = sc.nextInt();
                arrayList.remove(position);
            }
        }
        for(int i : arrayList)
            System.out.print(i + " ");
    }
}
