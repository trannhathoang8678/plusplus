package lesson4.studentmanagement;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        String name;
        float gpa;
        Student[] students = new Student[n];
        for(int i = 0;i < n;i++)
        {
            System.out.println("Student ID: " + (i+1));

            System.out.print("Name: ");
            name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("GPA: ");
            gpa = sc.nextFloat();
            students[i]= new Student(name,gpa);

        }
        StudentManagement management= new StudentManagement(students);
        System.out.println("Number of students passing: " + management.numberOfPass());
        System.out.println("Number of students failling: " + management.numberOfFail());
        System.out.println("The highest student: " + students[management.highestStudent()].getName());
        System.out.println("The lowest student: " + students[management.lowestStudent()].getName());
    }
}
