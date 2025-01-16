
//create a Mobilephone class
class Mobilephone{
    String brand;
	String model;
	int price;
	
	//constructor to intialize the attributes
	Mobilephone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // method to display Mobilephone deatils
    public void displayDetails(){
        System.out.println("Mobilephone brand : " + brand);
		System.out.println("Mobilephone model : " + model);
	    System.out.println("Mobilephone price : " + price);
	}

}

 public class MobilephoneDetails{  
  // main method 
	public static void main(String[] args){

		//create a Mobilephone objects
		Mobilephone phone1= new Mobilephone( "Samsung" , "Galaxy S24", 116999);
		Mobilephone phone2= new Mobilephone( "OnePlus", "Nord ce4", 24599 );


		// display the result of Mobilephone
		System.out.println("Mobilephone1 deatails");
		phone1.displayDetails();
		System.out.println("Mobilephone2 deatails");
		phone2.displayDetails();


	}
}