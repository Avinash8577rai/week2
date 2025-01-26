package problemstatement.librarymanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem>libraryItems=new ArrayList<>();

        libraryItems.add(new  Book(127545,"The Black Magic","F. Scott Fitzgerald"));
        libraryItems.add(new  DVD(127548,"Pushpa 2","SS RAJAMOLI"));
        libraryItems.add(new Magazine(127546,"National Geographic","Avinash"));

        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check if the item is reservable
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));

                // Attempt to reserve the item
                reservable.reserveItem("John Doe");
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            }

        }
    }
}
