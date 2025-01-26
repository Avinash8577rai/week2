package problemstatement.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable{
    private static  final int LOAN_DURATION=7;
    private  boolean isAvailable;

    public Magazine(int itemId, String title, String author){
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


    public boolean checkAvailability() {
        return isAvailable;
    }
}

