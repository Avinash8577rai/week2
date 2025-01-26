package problemstatement.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE=0.15;

        public NonVegItem(String itemName, double price, int quantity){
            super(itemName,price,quantity);
        }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Dicount Rate: "+(DISCOUNT_RATE*100)+" % ";
    }
}
