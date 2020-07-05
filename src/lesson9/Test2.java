package lesson9;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // ObjectInputStream oin = null;
        String s;

        s = new File("file/input.txt").getAbsolutePath();
        try( FileReader fin = new FileReader(s);
        BufferedReader bin = new BufferedReader(fin)) {
            int i = 0;
                int data ;
                while((data=bin.read()) != -1)
                System.out.print((char) data);
//             s = bin.readLine();
//            System.out.print(s);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        FileWriter fw = new FileWriter("/home/trannhathoang8678/Documents/plusplus/file/output.txt",true);
        PrintWriter bu = new PrintWriter(fw);
        bu.append('\n');
        bu.append("abc213");
        bu.close();
        System.out.println("hello");
    }
}
