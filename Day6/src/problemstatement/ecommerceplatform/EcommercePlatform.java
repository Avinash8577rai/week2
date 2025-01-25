package problemstatement.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

public class EcommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        products.add(new Electronics(7554575, "Smartphone", 50000));
        products.add(new Clothing(7845785, "T-Shirt", 2000));
        products.add(new Groceries(7548453, "Rice Bag", 1000));

        // Calculate and print final prices
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");
        }
    }

}
