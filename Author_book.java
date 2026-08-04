class Author {
    private String name , email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

   
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Author_book {
    public static void main(String[] args) {
     
        Author author = new Author("J.K. Rowling", "jkrowling@gmail.com", 'F');
        Book book = new Book("Harry Potter", author, 499.99, 100);
        System.out.println( book.getName());
        System.out.println( book.getPrice());
        System.out.println( book.getQtyInStock());
        System.out.println( book.getAuthor().getName());
        System.out.println(  book.getAuthor().getEmail());
        System.out.println( book.getAuthor().getGender());
    }
}