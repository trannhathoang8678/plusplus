package lesson5.acitivity52;

import java.util.Scanner;

public class Test52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number of workers: ");
        int n = sc.nextInt();
        int level,age;
        String name,sex,major;
        Worker[] workers = new Worker[n];
        for(int i = 0;i < n;i++)
        {
            System.out.println("Worker " + (i+1));
            System.out.print("Name: " );
            name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("Sex: " );
            sex = sc.nextLine();
            System.out.print("Age: " );
            age = sc.nextInt();
            System.out.print("level: " );
            level = sc.nextInt();
            workers[i] = new Worker(name,sex,age,level);
        }

        System.out.print("The number of employees: ");
         n = sc.nextInt();
        Engineer[] engineers = new Engineer[n];
        for(int i = 0;i < n;i++)
        {
            System.out.println("Employee " + (i+1));
            System.out.print("Name: " );
            name = sc.nextLine();
            if(i == 0)
            name = sc.nextLine();
            System.out.print("Sex: " );
            sex = sc.nextLine();
            System.out.print("Age: " );
            age = sc.nextInt();
            System.out.print("Major: " );
            major = sc.nextLine();
            major = sc.nextLine();
            engineers[i] = new Engineer(name,sex,age,major);
        }
        OfficialManagement management = new OfficialManagement(workers,engineers);
        System.out.print("Level of worker you want to find: ");
        level = sc.nextInt();
        int[] res = management.workerLevel(level);
        for(int i = 0;i < res.length;i++)
        {
            System.out.println("Worker " + (res[i]+1));
            workers[res[i]].properties();
        }
        System.out.print("Major of engineer you want to find: ");
        major = sc.nextLine();
        major = sc.nextLine();
         res = management.engineerMajor(major);
        for(int i = 0;i < res.length;i++)
        {
            System.out.println("Engineer " + (res[i]+1));
            engineers[res[i]].properties();
        }
    }
}
