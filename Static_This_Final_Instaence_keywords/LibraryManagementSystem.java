class Book{
  static String libraryName= "Wisdom Library";
  String title;
  String author;
  final String isbn; 
  
  
	// parameterized constructor
	Book(String title, String author, String isbn){
	this.title=title;
	this.author=author;
	this.isbn=isbn;
	
    }	
        public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
	
     	public void displayBookDetails(){
		if (this instanceof Book) {
		System.out.println("Library Name: " + libraryName);
		System.out.println(" title : "+ this.title);
		System.out.println(" author : "+ this.author);
		System.out.println(" isbn :"+ this.isbn);
		
		}else{
            System.out.println("Not a valid Book instance.");
        }
		
	}
}

	public class LibraryManagementSystem{
	public static void main(String[] args){
	
	
	
	Book book1= new Book("Java the complete ", " Herbert Schildt ", "123-325-466-505" );
	Book book2= new Book( "Let Us C" , " Yashavant Kanetkar ", "545-327-813-264-450");
        
		// Display book details
       
        book1.displayBookDetails();
	
        book2.displayBookDetails();
		

    }	
			
}