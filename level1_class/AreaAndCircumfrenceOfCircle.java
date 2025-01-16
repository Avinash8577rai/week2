//create a circle
class Circle{
    double radius;
   static double pi = 3.14;
	
	//constructor to intialize the attributes
	public Circle(double radius){
        this.radius= radius;
    }

    // method to calculate the area of circle 
    public double areaOfCircle(){
        return pi * radius * radius;
		
    }
	
	 // method to calculate the circumfrence of circle 
    public double circumfrenceOfCircle(){
        return 2 * pi * radius;
		}
	public void displayDetails(){
        System.out.println(" Raidus : " + radius);
		System.out.println(" Area Of Circle : " + areaOfCircle());
		System.out.println(" Circumfrence Of Circle : " + circumfrenceOfCircle()); 
		
	}
	
}
public class AreaAndCircumfrenceOfCircle{
	
	// main method 
    public static void main(String[] args){
    
	//create a  objects
    Circle circle1= new Circle( 5 );
	Circle circle2= new Circle( 8 );
	

// display the result of area of circle
System.out.println("Circle 1 deatails ");
circle1.displayDetails();

System.out.println("Circle 2 deatails ");
circle2.displayDetails();


   }
}