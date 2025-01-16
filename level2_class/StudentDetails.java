//create a Student class
class Student{
    String name;
	String rollNumber;
	int marks;
	
	//constructor to intialize the attributes
	Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
	
     //method to calulate the grade besed on marks
	 public String studentGrade(){
	        if(marks>= 90) {
			    return "A";
				}else if (marks>=80){
				        return "B";
					}else if (marks>=70){
				        return "C";
					}else if (marks>=60){
				        return "D";
					}else if (marks>=50){
				        return "E";
					}else {
				        return "Fail";
					}
	 
	 
	 }
    // method to display Student deatils
    public void displayDetails(){
        System.out.println("Student name : " + name);
		System.out.println("Student rollNumber : " + rollNumber);
	    System.out.println("Student marks : " + marks);
		System.out.println("Student marks : " + studentGrade());
	}

}

 public class StudentDetails{  
  // main method 
	public static void main(String[] args){

		//create a Student objects
		Student student1= new Student( "Anand Soni" , "0191CS211030", 90);
		Student student2= new Student( "Ankit Kumar", "0191CS211039", 95 );
		Student student3= new Student( "Avinash kumar rai", "0191CS211054", 85 );
		


		// display the result of Student
		System.out.println("Student1 deatails");
		student1.displayDetails();
		System.out.println("Student2 deatails");
		student2.displayDetails();
		System.out.println("Student2 deatails");
		student3.displayDetails();


	}
}