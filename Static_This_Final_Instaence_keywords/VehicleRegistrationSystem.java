class Vehicle {
    String ownerName;
	String registrationNumber;
    String vehicleType;
    static double registrationFee = 2500.0; 

    // Constructor
    Vehicle(String ownerName,String registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
		this.registrationNumber=registrationNumber;
        this.vehicleType = vehicleType;
    }
		 public static void updateRegistrationFee(double newFee) {
         registrationFee = 3500;
}
    // Instance method
			public void displayRegistrationDetails() {
			if (this instanceof Vehicle) { 
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
			} else {
            System.out.println("The object is not a Vehicle.");
        }
	}
	}
		
    public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("AVINASH"," UP53AB8577 ", "Car" );
        Vehicle v2 = new Vehicle("ANKIT" , " UP53AC8577", "Motorcycle");
        
		vehicle.updateRegistrationFee();
		
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

		System.out.println("\nAfter updating registration fee:");
        v1.displayRegistrationDetails();
    }
}