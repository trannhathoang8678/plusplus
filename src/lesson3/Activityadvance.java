package lesson3;

import java.util.Scanner;

public class Activityadvance {
    String[] fibo = new String[501];
    private boolean compare(String a,String b)
    {
        if(a.length()>b.length()) return true;
        if(a.length()<b.length()) return false;
        for(int i = 0;i < a.length() ; i++)
        {
            if((short)a.charAt(i)>(short)b.charAt(i))
                return true;
            if((short)a.charAt(i)<(short)b.charAt(i))
                return false;
        }
        return true;
    }
    private String sum(String a,String b)
    {
        String res="";
        short value,cnt=0;
        while(a.length()<b.length())
            a = '0' + a;
        while(a.length()>b.length())
            b = '0' + b;
        for(int i = a.length()-1; i >= 0; i--)
        {
            value = (short) ((short)a.charAt(i) - (short)'0'+(short)b.charAt(i) - (short)'0'+cnt);
            cnt=0;
            while(value >= 10)
            {
                value-=10;
                cnt++;
            }
            res=(char)(value+48) + res;
        }
        if(cnt>0)
            res=(char)(cnt+48) + res;
        return res;
    }
    private String sub(String a,String b)
    {
        String res="";
        short value,cnt=0;
        while(a.length()<b.length())
            a = '0' + a;
        while(a.length()>b.length())
            b = '0' + b;
        for(int i = a.length()-1; i >= 0; i--)
        {
            value = (short) ((short)a.charAt(i) - (short)'0'-(short)b.charAt(i) + (short)'0'-cnt);
            cnt=0;
            while(value < 0)
            {
                value+=10;
                cnt++;
            }
            res=(char)(value+48) + res;
        }
        cnt=0;
        while(cnt < (res.length()-1) && res.length() >1 &&res.charAt(cnt)=='0')
            cnt++;
        return res.substring(cnt);
    }
    public void init()
    {
        fibo[1]="1";
        fibo[2]="2";
        for(int i=3;i<=500;i++)
        {
            fibo[i]=sum(fibo[i-1],fibo[i-2]);
           // System.out.println(fibo[i]);
        }
    }
    private String convert(String Binary)
    {
        String result="0";
        int length=Binary.length();
        for(int i = length-1; i >= 0; i--)
            if(Binary.charAt(i)=='1')
                result = sum(fibo[length-i],result);
            return result;
    }
    private String reconvert(String x)
    {
        String res="";
        boolean start=false;
        for(int i = 500; i >= 1;i--)
        {
            if(compare(x,fibo[i]))
            {
               // System.out.println(x + " " + fibo[i]);
                res += '1';
                start = true;
                x=sub(x,fibo[i]);
            }
            else
                if(start)
                    res+='0';
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("X: ");
        String X= sc.next();
        System.out.print("Y: ");
        String Y= sc.next();
        //System.out.print(X + Y);
        Activityadvance A= new Activityadvance();
        A.init();
        System.out.print("X+Y: " + A.reconvert(A.sum(A.convert(X),A.convert(Y))));
    }
}
