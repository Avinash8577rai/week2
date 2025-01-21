class Patient {
    static String hospitalName = "City General Hospital";
    static int totalPatients = 0;
    final String patientID;
    String name;
    int age;
    String ailment;

    
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; 
    }
    public static int getTotalPatients() {
        return totalPatients;
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Using instanceof
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("This object is not a Patient instance.");
        }
    }
}


public class HospitalManagementSystem {
    public static void main(String[] args) {
      
        Patient patient1 = new Patient("P001", "John Doe", 30, "Flu");
        Patient patient2 = new Patient("P002", "Jane Smith", 25, "Fracture");

       
        System.out.println("Patient Details:");
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

       
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());

     
    }
}
