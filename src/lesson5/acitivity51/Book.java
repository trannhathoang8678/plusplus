package lesson5.acitivity51;

public class Book {
    private String name,author;
    long price,totalSold;
    //initialization
    public Book(String name, String author, long price, long totalSold)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.totalSold = totalSold;
    }
    public Book()
    {
        this("","",0,0);
    }
    //getters

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public long getTotalSold() {
        return totalSold;
    }

    public String getAuthor() {
        return author;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setTotalSold(long totalSold) {
        this.totalSold = totalSold;
    }
    // check if the book is best seller or not
    public boolean checkBestSeller()
    {
        if(totalSold > 1000)
            return true;
        else return false;
    }
}
