
//create a book class
class Book{
    String title;
	String author;
	int price;
	
	//constructor to intialize the attributes
	Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to display book deatils
    public void displayDetails(){
        System.out.println("book title : " + title);
		System.out.println("book author : " + author);
	    System.out.println("book price : " + price);
	}

}

 public class BookDetails{  
  // main method 
	public static void main(String[] args){

		//create a book objects
		Book book1= new Book( "Let Us C" , " Yashavant Kanetkar ", 450);
		Book book2= new Book( "Java the complete ", "Herbert Schildt", 600 );


		// display the result of book
		System.out.println("Book1 deatails");
		book1.displayDetails();
		System.out.println("Book2 deatails");
		book2.displayDetails();


	}
}