public class CircleRadius {
    double radius;

    // Default constructor
    public CircleRadius() {
        this(1.0);
	}

    // Parameterized constructor
    public CircleRadius(double radius) {
        this.radius = radius; 
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Main method to test the constructor chaining
    public static void main(String[] args) {
		
        // Using the default constructor
        CircleRadius circle1 = new CircleRadius();
        System.out.println("Default Circle Radius: " + circle1.getRadius());

        // Using the parameterized constructor
        CircleRadius circle2 = new CircleRadius(5.0);
        System.out.println("Custom Circle Radius: " + circle2.getRadius());
    }
}
