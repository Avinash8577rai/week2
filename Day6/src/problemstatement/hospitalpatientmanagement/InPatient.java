package problemstatement.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

    public class InPatient extends Patient implements MedicalRecord {
        private int numberOfDays;
        private double dailyRate;
        private List<String> medicalHistory;

        public InPatient(String patientId, String name, int age, int numberOfDays, double dailyRate) {
            super(patientId, name, age);
            this.numberOfDays = numberOfDays;
            this.dailyRate = dailyRate;
            this.medicalHistory = new ArrayList<>();
        }

        @Override
        public double calculateBill() {
            return numberOfDays * dailyRate;
        }

        @Override
        public void addRecord(String record) {
            medicalHistory.add(record);
        }


        public String viewRecords() {
            return "Medical Records: " + String.join(", ", medicalHistory);
        }
    }

