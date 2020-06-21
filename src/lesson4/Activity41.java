package lesson4;

public class Activity41 {
    public boolean check(int n)
    {
        String s = Integer.toString(n);
        int res = 0;
        for(int i = 0 ; i < s.length() ; i++)
            res+=((int)s.charAt(i) - (int)'0')*((int)s.charAt(i) - (int)'0')*((int)s.charAt(i) - (int)'0');
        if(res == n)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Activity41 activity41 = new Activity41();
        for(int i = 1; i <= 500 ; i++)
            if(activity41.check(i))
                System.out.print(i + " ");
    }
}
