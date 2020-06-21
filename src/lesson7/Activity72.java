package lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Activity72 {

        public static void main(String[] args) {

            List<Integer> arrayList = new ArrayList<>() ;
            List<Integer> linkedList = new LinkedList<>();
            int cnt = 0;
            long time = System.nanoTime();
            for(int i = 0; i < 100000;i++)
                linkedList.add(i);
            System.out.println(System.nanoTime() - time);
            time = System.nanoTime();
            for(int i = 0; i < 100000;i++)
                arrayList.add(i);
            System.out.println(System.nanoTime());
            time = System.nanoTime();
            for (int i :linkedList)
                cnt++;
            System.out.println(System.nanoTime() - time);
            time = System.nanoTime();
            for (int i :arrayList)
                cnt++;
            System.out.println(System.nanoTime() - time);
            time = System.nanoTime();
        }
}
