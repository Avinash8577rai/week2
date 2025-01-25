package problemstatement.ecommerceplatform;

public class Groceries extends Product{
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }


    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}
