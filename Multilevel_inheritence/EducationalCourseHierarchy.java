class Course{
String courseName;
String duration;

	Course(String courseName, String duration){
	this.courseName=courseName;
	this.duration=duration;
	}
	public void displayInfo(){
	System.out.println(" the course name is "+ courseName);
	System.out.println(" the course duration is "+ duration);
	}
}
class OnlineCourse extends Course{
String platform;
String isRecorded;

	OnlineCourse(String courseName, String duration, String platform, String isRecorded){
	super(courseName, duration);
	this.platform=platform;
	this.isRecorded=isRecorded;
	}
	
	public void displayInfo(){
	System.out.println(" the course platform is "+ platform);
	System.out.println(" the course Recorded is "+ isRecorded);
	super.displayInfo();
	}
}
	class PaidOnlineCourse extends OnlineCourse{
	int fee;
	int discount;
			
			PaidOnlineCourse(String courseName, String duration, String platform, String isRecorded, int fee, int discount){
			super(courseName, duration,platform, isRecorded);
			this.fee=fee;
			this.discount=discount;
			}
			
			public void displayInfo(){
			System.out.println(" the course Fee is "+ fee);
			System.out.println(" the course Discount is % "+ discount);
			super.displayInfo();
		}
	}

public class EducationalCourseHierarchy{
public static void main(String[] args){
		Course course = new Course("Java Fullstack", "8 Weeks");
        System.out.println("Course Status:");
        course.displayInfo();
		
		System.out.println(" OnlineCourse:");
        OnlineCourse online = new OnlineCourse("Java Fullstack", "8 Weeks", "Zoom", "Yes");
        online.displayInfo();

        System.out.println("Paid:");
        PaidOnlineCourse paid = new PaidOnlineCourse("Java Fullstack", "8 Weeks", "Zoom", "Yes", 20000, 10);
    
        paid.displayInfo();
    }
}