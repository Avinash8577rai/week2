import java.util.ArrayList;
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}


class Library {
     ArrayList<Book> books;

    
    public Library() {
        books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }

    
    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class LibraryAndBook {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java the complete ", " Herbert Schildt ");
        Book book2 = new Book("Let Us C" , " Yashavant Kanetkar ");
        Book book3 = new Book("Python For Beginners", "Harper Lee");

        // Creating Library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to the libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

    
        library1.displayBooks();
        library2.displayBooks();
    }
}
