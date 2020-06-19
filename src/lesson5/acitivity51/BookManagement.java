package lesson5.acitivity51;

import java.util.Scanner;

public class BookManagement {
    int n;
    Book[] books;
    public BookManagement()
    {
        String name,author;
        int totalSold,price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of books: ");
        n = sc.nextInt();
        books = new Book[n];
        for(int i = 0;i < n;i++)
        {
            System.out.println("Book " + (i+1));
            System.out.print("Name: ");
            name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("Author: ");
            author = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextInt();
            System.out.print("Total sold: ");
            totalSold = sc.nextInt();
            books[i] = new Book(name,author,price,totalSold);
        }
    }
    public int bestSellers()
    {
        int cnt = 0;
        for(int i = 0;i < n;i++)
            if(books[i].checkBestSeller())
                cnt++;
            return cnt;
    }
    public int bestSeller()
    {
        int id = 0;
        long max = 0;
        for(int i = 0;i < n;i++)
            if(books[i].checkBestSeller()&&( max < books[i].getTotalSold()))
            {
                id = i;
                max = books[i].getTotalSold();
            }
        return id;
    }
    // print properties of a book
    public void writeProperties(int id)
    {
        System.out.println("Book: "+ (id+1));
        System.out.println("Name: " + books[id].getName());
        System.out.println("Author: " + books[id].getAuthor());
        System.out.println("Price: " + books[id].getPrice());
        System.out.println("Total sold: " + books[id].getTotalSold());
    }
}
