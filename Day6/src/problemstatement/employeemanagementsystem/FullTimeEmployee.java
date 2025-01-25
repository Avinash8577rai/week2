package problemstatement.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{
    private double fixidSalary;
    private String departmentName;

        public  FullTimeEmployee( int employeeId,String name,  double baseSalary, double fixidSalary) {
            super(employeeId,name,baseSalary);
            this.fixidSalary = fixidSalary;


        }
         public double calculateSalary() {
             return fixidSalary + getBaseSalary();
    }

       public void assignDepartment(String departmentName) {
         this.departmentName = departmentName;
    }


        public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }

}
