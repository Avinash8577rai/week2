class Employee{
 String name;
 String id;
 int salary;
 
			Employee(String name, String id, int salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
		}	
			public void displayDeatails(){
			System.out.println(" The name of Employee "+ name);
			System.out.println(" The id of Employee "+ id);
			System.out.println(" The salary of Employee "+ salary);
		}
		}
		
		class Manager extends Employee{
		int teamSize;
		
		public Manager(String name, String id, int salary, int teamSize){
			super(name, id, salary);
			this.teamSize=teamSize;
			}
			
			public void displayDeatails(){
			System.out.println("the tean size is " + teamSize);
			super.displayDeatails();
			}
		}
		class Developer extends Employee{
		String programmingLanguage;
		
		public Developer(String name, String id, int salary, String programmingLanguage){
			super(name, id, salary);
			this.programmingLanguage=programmingLanguage;
			}
			
			public void displayDeatails(){
			System.out.println(" The Programming language use by Developer " + programmingLanguage);
			super.displayDeatails();
			}
		}
		
		class Intern extends Employee{
			String university;
			
			public Intern(String name, String id, int salary, String university){
			super(name, id, salary);
			this.university= university;
			}
			public void displayDeatails(){
			System.out.println(" The Intern come from this University " + university);
			super.displayDeatails();
			}
		}
		public class EmployeeManagementSystem{
		public static void main(String[] args){
		Employee emp= new Employee("Vishal sir ", " 75512145" , 35000);
		Manager manager= new Manager(" Shazaad sir ", " 75512146", 45000 , 25);
		Developer developer= new Developer(" SatyaPrakash  Sir " , " 75512140", 30000, "C++");
		Intern intern= new Intern(" Avinash", "75512199",25000,  " Technocrats Institute Of Technology");
		
		System.out.print(" The Employee deatails is ");
		emp.displayDeatails();
		System.out.print(" The Manager deatails is ");
		manager.displayDeatails();
		System.out.print(" The Developer deatails is ");
		developer.displayDeatails();
		System.out.print(" The Intern deatails is ");
		intern.displayDeatails();
		
		}
	}
		