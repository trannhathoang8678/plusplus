package lesson5.activity53;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println("Number of AV: " + dictionary.numberofAV());
        System.out.println("Number of AV: " + dictionary.numberofVA());
        System.out.println("The word you want to find its meaning: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Type: ");
        int type = sc.nextInt();
        sc.close();
        System.out.print("Meaning: " + dictionary.find(s,type));
    }
}
