
//create a employee class
public class Employee{
    String name;
	int salary;
	int id;
	
	//constructor to intialize the attributes
	public Employee(String name, int salary, int id){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display employee deatils
    public void displayDetails(){
        System.out.println("Employee name : " + name);
		System.out.println("Employee id : " + id);
	    System.out.println("Employee salary : " + salary);
	}

}
// main method 
  public class EmployeeDetails{  
  public static void main(String[] args){
    
	//create a employee objects
    Employee emp1= new Employee( "Vishal Bhakare" , 45000 , 45451177);
	Employee emp2= new Employee( "Shaikh Shahazad", 60000 , 45451170);
    Employee emp3= new Employee( "Satyaprakash Singh" , 45000 , 45451176);

// display the result of employee
System.out.println("Bridge labz Employee1 deatails");
emp1.displayDetails();
System.out.println("Beidge labz Employee2 deatails");
emp2.displayDetails();
System.out.println("Beidge labz Employee3 deatails");
emp3.displayDetails();

   }
}