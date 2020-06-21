package lesson7;

public class activity711  {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index of array out of bound");
        }
        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
            try {
                String obj = null;
                System.out.println(obj.length());
            }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer");
        }

        System.out.println("Finished!");

    }
}
