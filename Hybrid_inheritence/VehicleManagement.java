// Superclass Vehicle
class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface Refuelable
interface Refuelable {
    void refuel(); // Abstract method for refueling
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method specific to ElectricVehicle
    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }

    // Override to display ElectricVehicle details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.fuelCapacity = fuelCapacity;
    }

    // Implementing refuel() from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled. Fuel capacity: " + fuelCapacity + " liters.");
    }

    // Override to display PetrolVehicle details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Main class to test the implementation
public class VehicleManagement {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);

        // Create a PetrolVehicle object
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 200, 50);

        // Display details and specific behaviors for ElectricVehicle
        System.out.println("Electric Vehicle Details:");
        tesla.displayDetails();
        tesla.charge();

        System.out.println("\nPetrol Vehicle Details:");
        // Display details and specific behaviors for PetrolVehicle
        honda.displayDetails();
        honda.refuel();
    }
}
