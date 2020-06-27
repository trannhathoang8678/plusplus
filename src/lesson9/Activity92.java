package lesson9;

import java.io.File;

public class Activity92 {
    public static void main(String[] args) {
        File file =  new File("/home/trannhathoang8678/Documents/plusplus/file");
        String[] fileList = file.list();
        for(String name : fileList)
        {
            if(name.endsWith(".png")||name.endsWith(".jpec"))
                System.out.println(name);
        }
    }
}
