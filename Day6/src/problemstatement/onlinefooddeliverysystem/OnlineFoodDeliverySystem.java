package problemstatement.onlinefooddeliverysystem;
import java.util.List;
import java.util.ArrayList;
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem>foodItems=new ArrayList<>();

        foodItems.add(new VegItem("Paneer Butter Masala", 299, 2));
        foodItems.add(new NonVegItem("Chicken Curry", 350, 1));
        foodItems.add(new VegItem("Dal Tadka", 150, 3));


        for(FoodItem item : foodItems){
            System.out.println(item.getItemDetails());

            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price :" +totalPrice);

            if(item instanceof Discountable){
                Discountable discountable=(Discountable) item;
                double discount = discountable.applyDiscount();
                System.out.println(discountable.getDiscountDetails());
                System.out.println("Discount Amount: "+discount);
                System.out.println(" Final Price After Discount: "+(totalPrice-discount));

            }

        }
    }
}
