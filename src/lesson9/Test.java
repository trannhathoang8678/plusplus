package lesson9;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fin = null;
       // ObjectInputStream oin = null;
        BufferedReader bin = null;

            fin = new FileReader("/home/trannhathoang8678/Documents/plusplus/file/input.txt");
        //    oin = new ObjectInputStream("/home/trannhathoang8678/Documents/plusplus/fileinput/input.txt");
            bin = new BufferedReader(fin);
            int i = 0;
            String s = bin.readLine();
            System.out.print(s);
            bin.close();
            fin.close();
            FileWriter fw = new FileWriter("/home/trannhathoang8678/Documents/plusplus/file/input.txt");
        PrintWriter bu = new PrintWriter(fw);
        bu.print(s+"abc");
        bu.close();
    }
}
