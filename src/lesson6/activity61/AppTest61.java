package lesson6.activity61;

import java.util.Scanner;

public class AppTest61 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of staffs: ");
        n = sc.nextInt();
        StaffManagement management = new StaffManagement(n);
        management.input();
        management.output();
        System.out.println("Properties of highest staff: ");
        management.properties(management.highestStaff());
        System.out.println("Properties of lowest staff: ");
        management.properties(management.lowestStaff());
    }
}
