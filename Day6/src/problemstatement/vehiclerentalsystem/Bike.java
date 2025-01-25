package problemstatement.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE=0.03;
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber,"Bike", rentalRate);
        this.insurancePolicyNumber=insurancePolicyNumber;
    }
    public  double calculateRentalCost(int days){
        return getRentalRate()*days;
    }


    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber + " Rate" + INSURANCE_RATE * 100 + "%";

    }
}
