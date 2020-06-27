package lesson9;

import java.io.*;

public class Activity95 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/trannhathoang8678/Documents/plusplus/file/input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/trannhathoang8678/Documents/plusplus/file/output.txt");
        PrintWriter pw = new PrintWriter(fw);
        String s = "", res = "";
        while ((s = br.readLine()) != null)
        {
            String[] a =s.split(" ");
            for(String word : a)
                if(word.length() > res.length())
                    res=word;
        }
        pw.print(res);
        fr.close();
        br.close();
        pw.close();
    }
}