class Order{
String orderId;
String orderDate;

	Order(String orderId, String orderDate){
	this.orderId=orderId;
	this.orderDate=orderDate;
	}
	public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

  
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
class ShippingOrder extends Order{
String trackingNumber;
	
	ShippingOrder(String orderId, String orderDate, String trackingNumber){
	super( orderId, orderDate);
	this.trackingNumber=trackingNumber;
	}
	public String getOrderStatus() {
        return "Order Placed with tracking number " + trackingNumber;
    }
	
	public void displayDetails(){
		System.out.println("Tracking Number: " + trackingNumber);
		super.displayDetails();
		}
	}
class DeliveredOrder extends ShippingOrder{
String deliveryDate;
		
		DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate=deliveryDate;
		}
		public String getOrderStatus() {
        return "Order is delivered " + deliveryDate;
    }
		public void displayDetails(){
		System.out.println("Delivered date: " + deliveryDate);
		super.displayDetails();
		}
	}
	public class OnlineRetailOrderManagement{
	public static void main(String[] args){
	        Order order = new Order("OD2545788512", "2025-01-20");
        System.out.println("Order Status:");
        System.out.println(order.getOrderStatus());
        order.displayDetails();

        System.out.println("Shipped Order:");
        ShippingOrder shipped = new ShippingOrder("OD2545788512", "2025-01-21", "TRK123456789");
        System.out.println(shipped.getOrderStatus());
        shipped.displayDetails();

        System.out.println("\nDelivered Order:");
        DeliveredOrder deliveredOrder = new DeliveredOrder("OD2545788512", "2025-01-22", "TRK987654321", "2025-01-24");
        System.out.println(deliveredOrder.getOrderStatus());
        deliveredOrder.displayDetails();
    }
}
		