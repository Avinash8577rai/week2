package problemstatement.ecommerceplatform;

public class Electronics extends Product implements Taxable{
    private static final double TAX_RATE = 0.18;
    private static final double DISCOUNT_RATE = 0.10;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }


    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }


    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }


    public String getTaxDetails() {
        return "Electronics Tax Rate: 18%";
    }

}