package lesson5.acitivity51;

public class AppTest {
    public static void main(String[] args) {
       BookManagement management = new BookManagement();
       System.out.print("Number of best sellers: ");
       System.out.println(management.bestSellers());
       System.out.println("The best seller: ");
       management.writeProperties(management.bestSeller());
    }
}
