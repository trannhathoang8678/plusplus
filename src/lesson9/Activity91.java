package lesson9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Activity91 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
       // ObjectInputStream oin = null;
        BufferedInputStream bin = null;
        try
        {
            fin = new FileInputStream("/home/trannhathoang8678/Documents/plusplus/fileinput/input.txt");
        //    oin = new ObjectInputStream("/home/trannhathoang8678/Documents/plusplus/fileinput/input.txt");
            bin = new BufferedInputStream(fin);
            int i = 0;
            while((i = bin.read()) != -1) {
                System.out.print((char)i );
            }
        }
        catch (Exception e )
        {
            System.out.print(e);
        }
        finally {
            bin.close();
            fin.close();
        }
    }
}
