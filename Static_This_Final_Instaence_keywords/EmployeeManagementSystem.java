class Employee{
    static String companyNames= "Capgemini";
	String name;
	String designation;
	int id;
	
	//constructor
	public Employee(String name, String designation, int id){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
	    public static void displayLibraryName() {
        System.out.println("Company Name: " + companyNames);
    }

    // method to display employee deatils
    public void displayDetails(){
	    if (this instanceof Employee) {
	    System.out.println("Company Name: " + companyNames);
        System.out.println("Employee name : " + this.name);
		System.out.println("Employee id : " + this.id);
	    System.out.println("Employee designation : " + this.designation);
	}else{
            System.out.println("Not a valid Company instance.");
        }

  }
}
 
  public class EmployeeManagementSystem{ 
  
  public static void main(String[] args){
    
	//create a employee objects
    Employee emp1= new Employee( "Vishal Bhakare" , " Developer" , 45451177);
	Employee emp2= new Employee( "Shaikh Shahazad"," Senior Developer ", 45451170);
    Employee emp3= new Employee( "Satyaprakash Singh" , " Developer " , 45451176);

// display the result of employee
		System.out.println(" Capgemini Employee1 deatails");
		emp1.displayDetails();
		System.out.println(" Capgemini Employee2 deatails");
		emp2.displayDetails();
		System.out.println(" Capgemini Employee3 deatails");
		emp3.displayDetails();

   }
}