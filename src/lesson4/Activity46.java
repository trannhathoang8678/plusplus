package lesson4;

import java.util.Scanner;

public class Activity46 {
    private void getSandwick(String s)
    {
        System.out.print('\"');
        if(s.lastIndexOf("bread")> s.indexOf("bread"))
            for(int i = s.indexOf("bread") + 5; i < s.lastIndexOf("bread") ; i++ )
                System.out.print(s.charAt(i));
        System.out.print('\"');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Activity46 Act46 = new Activity46();
        String s = sc.nextLine();
        Act46.getSandwick(s);
    }
}
