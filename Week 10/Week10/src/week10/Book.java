package week10;

public class Book {
        private String bookTitle, publisher;
        private int year;
        private double price;
       
        private static String UNI = "University of Malaya";
    
    public static String getUNI() {
        return UNI;
    }    
    
    public void setUNI(String UNI) {
        this.UNI = UNI;
    }
        
    public Book(String bookTitle, String publisher, int year, double price) {
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }
    
    public Book(Book a) {
        if(a!=null) {
            this.setBookTitle(a.getBookTitle());
            this.setPrice(a.getPrice());
            this.setPublisher(a.getPublisher());
            this.setYear(a.getYear());
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
    public String toString() {
        String str;
        str = "Book - " + bookTitle + "("+ year + ")\n";
        str = str + "Publisher - " + publisher + "\n";
        str = str + "Price - " + price;
        return str;
    } 
    
}
