class Person {
    String name;
    int id;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


interface Worker {
    void performDuties(); 

class Chef extends Person implements Worker {
    String specialty;
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

       @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes, specializing in " + specialty + ".");
    }

    
    
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Specialty: " + specialty);
    }
}


class Waiter extends Person implements Worker {
    int tablesAssigned;

    
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id); // Call superclass constructor
        this.tablesAssigned = tablesAssigned;
    }

    
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers and managing " + tablesAssigned + " tables.");
    }

  
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}


public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");

        // Create a Waiter object
        Waiter waiter = new Waiter("John Doe", 202, 5);

        // Display details and perform duties for Chef
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        // Display details and perform duties for Waiter
        waiter.displayDetails();
        waiter.performDuties();
    }
}
