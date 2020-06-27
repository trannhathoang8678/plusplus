package lesson9;

import java.io.*;

public class Activity94 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/trannhathoang8678/Documents/plusplus/file/input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/trannhathoang8678/Documents/plusplus/file/output.txt");
        PrintWriter pw = new PrintWriter(fw);
        int n;
        while ((n = br.read()) != -1)
            pw.print(n + " ");
        fr.close();
        br.close();
        pw.close();
    }
}
