package problemstatement.vehiclerentalsystem;
import java.util.List;
import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle>vehicles=new ArrayList<>();

        vehicles.add(new Car("UP53BE8577","Car",500, "7500152475"));
        vehicles.add(new Bike("UP53CE8577","Bike",200, "7500152475"));
        vehicles.add(new Truck("UP53DE8577","Truck",800, "7500152475"));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Rate: " + vehicle.getRentalRate());

            // Calculate rental cost for 5 days
            double rentalCost = vehicle.calculateRentalCost(5);
            System.out.println("Rental Cost for 5 days: " + rentalCost);

            // If the vehicle is insurable, calculate insurance
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                double insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }
        }
    }
}
