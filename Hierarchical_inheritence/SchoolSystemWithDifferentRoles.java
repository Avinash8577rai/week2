class Person{
String name;
int age;
		Person(String name, int age){
		this.name=name;
		this.age=age;
		}
		 void displayInfo(){
		System.out.println("Person name is" + name);
		System.out.println("Person age is "+ age);
		}
		void displayRole(){
		System.out.println(" Role of person is:");
		}
	}
	class Teacher extends Person{
	String subject;
	
		Teacher(String name, int age, String subject){
		super(name, age);
		this.subject=subject;
		
		}
		void displayInfo(){
		System.out.println("Teacher Which subject tought" + subject);
		super.displayInfo();
		}
		void displayRole(){
		System.out.println(" Role of person is: Teacher");
		}
	}
	class Student extends Person{
	String grade;
	
		Student(String name, int age, String grade){
		super(name, age);
		this.grade=grade;
		
		}
		void displayInfo(){
		System.out.println("Student got Grade" + grade);
		super.displayInfo();
		}
		void displayRole(){
		System.out.println(" Role of person is: Student");
		}
	}
	class Staff  extends Person{
	String work;
	
		Staff(String name, int age, String work){
		super(name, age);
		this.work=work;
		
		}
		void displayInfo(){
		System.out.println("Staff  Working" + work);
		super.displayInfo();
		}
		void displayRole(){
		System.out.println(" Role of person is: Staff ");
		}
	}
	public class  SchoolSystemWithDifferentRoles{
	public static void main(String[] args){
		Person person = new Person(" Dr. Rajesh Boghey", 52);
		
        Teacher teacher = new Teacher("Dr. Rajesh Boghey", 52, " Data Structure" );
        Student student = new Student(" Avinash", 22, "A+");
		Staff staff= new Staff(" Amarjeet", 32, "Sweeper");
        
		System.out.println("Person daetails is:");
        person.displayRole();
        person.displayInfo();
        System.out.println("Staff daetails is:");
        staff.displayRole();
        staff.displayInfo();

        System.out.println("Teacher Details:");
        teacher.displayRole();
        teacher.displayInfo();

        System.out.println("Student Details:");
        student.displayRole();
        student.displayInfo();
    }
}