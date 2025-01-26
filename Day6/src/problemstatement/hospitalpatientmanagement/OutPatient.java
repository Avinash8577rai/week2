package problemstatement.hospitalpatientmanagement;
import java.util.List;
import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {
        private double consultationFee;
        private List<String> medicalHistory;

        public OutPatient(String patientId, String name, int age, double consultationFee) {
            super(patientId, name, age);
            this.consultationFee = consultationFee;
            this.medicalHistory = new ArrayList<>();
        }

        @Override
        public double calculateBill() {
            return consultationFee;
        }

        @Override
        public void addRecord(String record) {
            medicalHistory.add(record);
        }

        @Override
        public String viewRecords() {
            return "Medical Records: " + String.join(", ", medicalHistory);
        }
    }

