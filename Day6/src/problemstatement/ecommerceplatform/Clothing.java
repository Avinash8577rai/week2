package problemstatement.ecommerceplatform;

public class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // 5% tax
    private static final double DISCOUNT_RATE = 0.15; // 15% discount

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }


    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }


    public String getTaxDetails() {
        return "Clothing Tax Rate: 5%";
    }
}