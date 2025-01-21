class Student{
	static String universityName= "Technocrats Institute Of Technology"; 
    String name;
	final String rollNumber;
	int marks;
	static int totalStudent=0;
	
	//constructor to intialize the attributes
	Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
		totalStudent++;
    }
		public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudent);
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
		if (this instanceof Student) {
		System.out.println("University Name: " + universityName);
        System.out.println("Student name : " + name);
		System.out.println("Student rollNumber : " + rollNumber);
	    System.out.println("Student marks : " + marks);
		System.out.println("Student marks : " + studentGrade());
	}else {
			 System.out.println("Not a valid Student instance.");
        }
	

}
}

 public class  UniversityStudentManagement{  
 
  // main method 
	public static void main(String[] args){
		
		

		//create a Student objects
		Student student1= new Student( "Anand Soni" , "0191CS211030", 90);
		Student student2= new Student( "Ankit Kumar", "0191CS211039", 95 );
		Student student3= new Student( "Avinash kumar rai", "0191CS211054", 85 );
		
		  Student.displayTotalStudents();


		// display the result of Student
		System.out.println("Student1 deatails");
		student1.displayDetails();
		System.out.println("Student2 deatails");
		student2.displayDetails();
		System.out.println("Student2 deatails");
		student3.displayDetails();


	}
}