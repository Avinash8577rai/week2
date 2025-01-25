package problemstatement.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String departmentName;

        public PartTimeEmployee(int employeeId, String name,  double baseSalary, int hoursWorked, double hourlyRate){
            super(employeeId,name,baseSalary);
            this.hourlyRate=hourlyRate;
            this.hoursWorked=hoursWorked;

        }

        public double calculateSalary() {
          return hoursWorked * hourlyRate + getBaseSalary();
        }

        public void assignDepartment(String departmentName) {
            this.departmentName = departmentName;
        }


        public String getDepartmentDetails() {
            return "Department: " + departmentName;
        }

}
