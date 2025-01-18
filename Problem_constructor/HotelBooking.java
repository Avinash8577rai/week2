public class HotelBooking {
     String guestName;
     String roomType;
     int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Ankit Kumar";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

   
    // Display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method to test the HotelBooking class
    public static void main(String[] args) {
	
        // Using the default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 (Default):");
        booking1.displayBooking();

        // Using the parameterized constructor
        HotelBooking booking2 = new HotelBooking("Avinash Rai", "Deluxe", 3);
        System.out.println("\nBooking 2 (Parameterized):");
        booking2.displayBooking();

        // Using the copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nBooking 3 (Copied from Booking 2):");
        booking3.displayBooking();

        
    }
}
