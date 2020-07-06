package lesson5.activity53;

import java.util.Scanner;

public class Dictionary {
    Word[] words;
    //initialization

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Dictionary() {
        System.out.println("Number of words: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        words = new Word[n];
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

    }

    public int numberofAV() {
        int cnt = 0;
        for (Word word : words)
            if (word.getType() == 0)
                cnt++;
        return cnt;
    }

    public int numberofVA() {
        int cnt = 0;
        for (Word word : words)
            if (word.getType() == 1)
                cnt++;
        return cnt;
    }

    // find the meanging of word
    public String find(String s,int type) {
        for (Word word : words)
            if (word.getKey().equals(s) && word.getType() == type)
                return word.getValue();
        return "No meaning";
    }
}
