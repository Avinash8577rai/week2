// MovieTicket Class
class MovieTicket {
     String movieName;
     String seatNumber;
     double price;
	 boolean isBooked;

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price; 
		this.isBooked = false;
    }

    // Method to book a ticket and see seat and price
    public void bookTicket() {
        if (isBooked){
		isBooked = true;
            System.out.println("Ticket booked successfully for seat: " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

// Main Class
public class MovieTicketBookingSystem {

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Pushpa2", "A12", 300.0);
        ticket.displayTicketDetails();
        ticket.bookTicket();
        ticket.displayTicketDetails();
        ticket.bookTicket(); 
    }
}

}
