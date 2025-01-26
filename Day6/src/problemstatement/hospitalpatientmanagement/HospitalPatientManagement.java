package problemstatement.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

        public class HospitalPatientManagement {
            public static void main(String[] args) {
                // List to store patients
                List<Patient> patients = new ArrayList<>();

                // Add patients
                InPatient inPatient = new InPatient("P001", "Alice", 30, 5, 2000);
                inPatient.addRecord("Admitted for surgery");
                inPatient.addRecord("Post-operative care");
                patients.add(inPatient);

                OutPatient outPatient = new OutPatient("P002", "Bob", 45, 500);
                outPatient.addRecord("Routine check-up");
                patients.add(outPatient);

                // Process patients
                for (Patient patient : patients) {
                    System.out.println(patient.getPatientDetails());
                    System.out.println("Bill Amount: " + patient.calculateBill());

                    if (patient instanceof MedicalRecord) {
                        MedicalRecord record = (MedicalRecord) patient;
                        System.out.println(record.viewRecords());
                    }

                    System.out.println("--------------------------------");
                }
            }
        }