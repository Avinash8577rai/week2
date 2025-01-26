package problemstatement.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
    private static  final int LOAN_DURATION=5;
    private  boolean isAvailable;

    public DVD(int itemId, String title, String author){
        super(itemId,title,author);
        this.isAvailable=true;
    }


    public int getLoanDuration() {
        return LOAN_DURATION;
    }
    public boolean reserveItem(String borrowerName) {
        if(isAvailable){
            isAvailable=false;
            System.out.println("Book Reserved for :"+borrowerName);
            return true;
        }
        System.out.println("Book is not avilable.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
