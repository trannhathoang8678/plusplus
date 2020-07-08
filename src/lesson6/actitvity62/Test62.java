package lesson6.actitvity62;

import java.util.Scanner;

public class Test62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,age;
        String name;
        char sex;
        System.out.print("Number of employees: ");
        n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("Write 0 for fulltime employee and 1 for partime employee");
            int type = sc.nextInt();
            name = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.println("Sex (M or F): " );
             sex = sc.next().charAt(0);
            System.out.print("Age: ");
            age = sc.nextInt();
            if(type == 0)
            {
                System.out.print("Write 0 for staff and 1 for boss: ");
                int isboss = sc.nextInt();
                System.out.print("Bonus days working: ");
                int dayWorking = sc.nextInt();
                employees[i] = new FulltimeEmployee(name,age,sex,(isboss == 1),dayWorking);
            }
            else
            {
                System.out.print("Hours working: ");
                int hourWorking = sc.nextInt();
                employees[i] = new ParttimeEmployee(name,age,sex,hourWorking);
            }
        }
        for(int i = 0; i < n; i++)
            System.out.println("Salary of employee " + (i + 1) + " is " + employees[i].salary());

    }
}
