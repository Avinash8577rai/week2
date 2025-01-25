class Book{
String title;
int publicationYear;

	Book(String title, int publicationYear){
	this. title=title;
	this.publicationYear=publicationYear;
	}
		public void displayInfo(){
		    System.out.println(" The title of Book is  "+ title);
			System.out.println(" The Publication Year of Book is  "+ publicationYear);
		 }
	}
		class Author extends Book {
		String name;
		String bio;
		
			Author(String title, int publicationYear, String name , String bio){
			super(title, publicationYear);
			this.name=name;
			this.bio=bio;
			}
			public void displayInfo(){
			System.out.println(" The Author name is "+ name);
			System.out.println(" The Author bio is " + bio);
			super.displayInfo();
			}
		}
			public class LibraryManagementWithBooksAndAuthors{
			public static void main(String[] args){
			
			
			Author author=new Author(" Let Us C " , 1989, " Yashavant P Kanetkar ", " Yashavant Kanetkar is an Indian computer science author" );
			
				
				System.out.println(" The Book info");
				author.displayInfo();
			
			}
		}
			