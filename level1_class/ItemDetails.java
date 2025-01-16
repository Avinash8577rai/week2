
//create a Item class
class Item{
    String itemName;
	String itemCode;
	int price;
	
	//constructor to intialize the attributes
	Item(String itemName, String itemCode, int price){
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }
	 // Method to calculate total cost for a given quantity
    public int calculateTotalCost(int quantity) {
        return price * quantity;
    }
	

    // method to display Item deatils
    public void displayDetails(){
        System.out.println("Item name : " + itemName);
		System.out.println("Item code : " + itemCode);
	    System.out.println("Item price : " + price);
	}

}

 public class ItemDetails{  
  // main method 
	public static void main(String[] args){

		//create a Item objects
		Item item1= new Item( "Laptop" , " 75055142", 45000);
		Item item2= new Item( "Laptop Bag", "75055144", 850 );


		// display the result of Item
		System.out.println("Item1 deatails");
		item1.displayDetails();
		System.out.println("Item2 deatails");
		item2.displayDetails();
        System.out.println("Total Cost for 2 units: " + item1.calculateTotalCost(2));

       System.out.println("Total Cost for 4 units: " + item2.calculateTotalCost(4));

	}
}