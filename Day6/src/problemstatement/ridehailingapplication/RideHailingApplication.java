package problemstatement.ridehailingapplication;
import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {

        // List to store vehicles
            List<Vehicle> vehicles = new ArrayList<>();

            // Add vehicles
            Car car = new Car("C001", "Avinash", 15);
            car.updateLocation("Downtown");
            vehicles.add(car);

            Bike bike = new Bike("B001", "Ananad", 8);
            bike.updateLocation("City Center");
            vehicles.add(bike);

            Auto auto = new Auto("A001", "Ayushi", 10);
            auto.updateLocation("Suburbs");
            vehicles.add(auto);

            // Calculate fare for each vehicle
            double distance = 12.5; // Distance in km
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.getVehicleDetails());
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
                System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
                System.out.println("--------------------------------");
            }
        }
    }

