package lesson9;

import java.io.File;

public class Activity91 {
    public static void main(String[] args) {
        File file = new File("/home/trannhathoang8678/Documents/plusplus/file/");
        String[] fileList = file.list();
        for(String name : fileList)
            System.out.println(name);
    }
}
