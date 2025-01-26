package problemstatement.librarymanagementsystem;

public interface Reservable {
       boolean reserveItem(String borrowerName);
       boolean checkAvailability();
}
