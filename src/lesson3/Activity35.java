package lesson3;

import java.util.Scanner;

public class Activity35 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j <= (n-i); j++)
                System.out.print(' ');
            for(int j = n-i+1;j <= n; j++ )
                System.out.print((char)((int)'A'+ j-(n-i+1)));
            for(int j = n+1; j <= (n+i-1);j++)
                System.out.print((char)((int)'A'+ (n+i-1) - j));
            System.out.println();
        }
        for(int i = n-1 ; i >= 1;i--)
        {
            for(int j = 1;j <= (n-i); j++)
                System.out.print(' ');
            for(int j = n-i+1;j <= n; j++ )
                System.out.print((char)((int)'A'+ j-(n-i+1)));
            for(int j = n+1; j <= (n+i-1);j++)
                System.out.print((char)((int)'A'+ (n+i-1) - j));
            System.out.println();
        }
    }
}
