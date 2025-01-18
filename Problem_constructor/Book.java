public class Book {
    
    public String title;
    public String author;
    public double price;
    public boolean isAvailable;

    // Constructor to initialize the book details
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable; 
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) { 
            System.out.println("You have successfully borrowed the book: " + title);
            isAvailable = false; 
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display book
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create a book object
        Book book1 = new Book("Let  us C", "Yashavant Kanetkar", 699 true);

        // Display book details
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Borrow the book
        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        // Try borrowing the book again
        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();

        // Display book details after borrowing
        System.out.println("\nBook Details After Borrowing:");
        book1.displayBookDetails();
    }
}
