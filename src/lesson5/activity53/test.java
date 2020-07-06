package lesson5.activity53;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Number of words: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Word[] words = new Word[n];
        String key, value;
        int type;
        System.out.println("Write 0 for AV and 1 for VA");
        for (int i = 0; i < n; i++) {
            System.out.println("Word " + (i + 1));
            System.out.print("Type: ");
            type = sc.nextInt();
            System.out.print("Key: ");
            key = sc.nextLine();
            key = sc.nextLine();
            System.out.print("Value: ");
            value = sc.nextLine();
            words[i] = new Word(key, value, type);
        }
        Dictionary dictionary = new Dictionary(words);
        System.out.println("Number of AV: " + dictionary.numberofAV());
        System.out.println("Number of AV: " + dictionary.numberofVA());
        System.out.println("The word you want to find its meaning: ");
        String s = sc.nextLine();
        System.out.print("Type: ");
         type = sc.nextInt();
        sc.close();
        System.out.print("Meaning: " + dictionary.find(s, type));
    }
}
