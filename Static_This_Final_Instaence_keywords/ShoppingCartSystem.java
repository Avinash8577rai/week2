class Product {
    static double discount= 15.0;
    String itemName;
	final String itemID;
    double price;
    int quantity;

    // Constructor to initialize item details
    public Product(String itemName, String itemID,double price, int quantity) {
        this.itemName = itemName;
		this.itemID = itemID;
        this.price = price;
        this.quantity = quantity;
    }
	 public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }
		public static void UpdateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    
        public double calculatePriceAfterDiscount() { {
        return (price * quantity) * (1 - discount / 100);
    }
} 		 public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + itemID);
            System.out.println("Product Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price After Discount: " + calculatePriceAfterDiscount());
        } else {
            System.out.println("Not a valid Product instance.");
        }
    }
}
	



public class ShoppingCartSystem {
	public static void main(String[] args) {
     Product.updateDiscount(15.0);

        // Create product instances
        Product product1 = new Product("PID-001", "Laptop", 75000.00, 2);
        Product product2 = new Product("PID-002", "Smartphone", 24999.00, 1);

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();

        
    }
}