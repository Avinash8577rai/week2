class Book{
  String title;
  String author;
  int price;
  boolean isavilable;
	

	// parameterized constructor
	Book(String title, String author, int price){
	this.title=title;
	this.author=author;
	this.price=price;
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
		void displayBook(){
		System.out.print(" title "+ title);
		System.out.print(" author "+ author);
		System.out.print(" price "+ price);
		  System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
		
		
	}
	public static void main(String[] args){
	Book book1= new Book("Java the complete ", " Herbert Schildt ", 600 );
	
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