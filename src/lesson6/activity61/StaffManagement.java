package lesson6.activity61;


import java.util.Scanner;

public class StaffManagement {
    int n;
    Staff[] staffs;
    //initialization
    public StaffManagement(int n)
    {
        staffs = new Staff[n];
        this.n = n;
    }
    // import staffs' data
    public void input()
    {
        String name,numberIdentification;
        int age,totalWorking;
        long salary;
        int kindOfStaff = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n;i++) {

            System.out.println("Staff " +(i+1));
            System.out.println("Kind of staff (Write number): ");
            System.out.println("1.Fulltime staff");
            System.out.println("2.Parttime staff");
            kindOfStaff = sc.nextInt();
            System.out.print("Name: ");
            name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.println("Number identification: ");
            numberIdentification = sc.nextLine();
            numberIdentification = sc.nextLine();
            if (kindOfStaff == 1) {
                System.out.print("Total working day: ");
                totalWorking = sc.nextInt();
                System.out.print("Salary per day: ");
                salary = sc.nextLong();
                staffs[i] = new FulltimeStaff(name,age,numberIdentification,totalWorking,salary);
            }
            else
            {
                System.out.print("Total working shift: ");
                totalWorking = sc.nextInt();
                System.out.print("Salary per shift: ");
                salary = sc.nextLong();
                staffs[i] = new ParttimeStaff(name,age,numberIdentification,totalWorking,salary);
            }
        }
    }
    //print list of staffs
    public void output()
    {
        for(int i = 0; i < n;i++)
        {
            System.out.println("Staff " + (i+1));
            if(staffs[i].getMealAllowance() == 2000000)
            System.out.println("Fulltime staff");
            else
                System.out.println("Parttime staff");
            System.out.println("Name: " + staffs[i].getName());
            System.out.println("Age: " + staffs[i].getAge());
            System.out.println("Number identification: " + staffs[i].getNumberIdentification());
            System.out.println("Salary: " + staffs[i].calculateSalary());
        }
    }
    //print properties of one staff
    public void properties(int id)
    {
        System.out.println("Staff " + (id+1));
        if(staffs[id].getMealAllowance() == 2000000)
            System.out.println("Fulltime staff");
        else
            System.out.println("Parttime staff");
        System.out.println("Name: " + staffs[id].getName());
        System.out.println("Age: " + staffs[id].getAge());
        System.out.println("Number identification: " + staffs[id].getNumberIdentification());
        System.out.println("Salary: " + staffs[id].calculateSalary());
    }
    public int highestStaff()
    {
        int res=0;
        long salary = 0;
        for(int i = 0; i < n;i++)
            if( salary < staffs[i].calculateSalary())
            {
                res = i;
                salary = staffs[i].calculateSalary();
            }
        return res;
    }
    public int lowestStaff()
    {
        int res=0;
        long salary = 9000000000000000000L;
        for(int i = 0; i < n;i++)
            if( salary > staffs[i].calculateSalary())
            {
                res = i;
                salary = staffs[i].calculateSalary();
            }
        return res;
    }
}
