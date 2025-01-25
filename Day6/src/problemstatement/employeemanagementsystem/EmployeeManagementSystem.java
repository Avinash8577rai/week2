package problemstatement.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee
        FullTimeEmployee fte = new FullTimeEmployee(755575524, "Avinash", 50000, 10000);
        fte.assignDepartment("Engineering");
        employees.add(fte);


        PartTimeEmployee pte = new PartTimeEmployee(755575525, "Anand", 20000, 20, 500);
        pte.assignDepartment("Design");
        employees.add(pte);

        // Process and display employee details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("-----------------------------------");
        }

    }
}
