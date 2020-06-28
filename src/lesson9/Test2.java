package lesson9;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // ObjectInputStream oin = null;
        String s;
        try( FileReader fin = new FileReader("/home/trannhathoang8678/Documents/plusplus/file/input.ttt");
        BufferedReader bin = new BufferedReader(fin)) {
            int i = 0;try(FileInputStream inputStream = new FileInputStream("E://file.txt");
                          BufferedInputStream bufferInputStream = new BufferedInputStream(inputStream)) {
                int data = bufferInputStream.read();
                while(data != -1) {
                    System.out.print((char) data);
                    data = bufferInputStream.read();
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             s = bin.readLine();
            System.out.print(s);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        FileWriter fw = new FileWriter("/home/trannhathoang8678/Documents/plusplus/file/input.txt");
        PrintWriter bu = new PrintWriter(fw);
        bu.print("abc213");
        bu.close();
        System.out.println("hello");
    }
}
