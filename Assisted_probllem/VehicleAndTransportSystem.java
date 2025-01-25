class Vehicle{
int maxSpeed;
String fuelType;

		Vehicle( int maxSpeed,String fuelType ){
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
		}
		
			public void displayInfo(){
			System.out.println(" The max speed is "+ maxSpeed);
			System.out.println(" The fuel type is "+ fuelType);
		 }
	}
		class Car extends Vehicle{
		int seatCapacity;
		
			Car( int maxSpeed, String fuelType, int seatCapacity ){
			super(maxSpeed, fuelType);
			this.seatCapacity=seatCapacity;
			}
			public void displayInfo(){
			System.out.println(" The seat capacity of car is  "+ seatCapacity);
			super.displayInfo();
		
		 }
	}
		class Truck extends Vehicle{
		int wheels;
			
				Truck(int maxSpeed, String fuelType, int wheels){
				super(maxSpeed, fuelType);
				this.wheels=wheels;
				}
				public void displayInfo(){
				System.out.println(" The number of wheels in truck is "+ wheels);
				super.displayInfo();
		
		 }
	}
	
		class Motorcycle extends Vehicle{
		String enginePower;
		
				Motorcycle(int maxSpeed, String fuelType, String enginePower){
				super(maxSpeed, fuelType);
				this.enginePower=enginePower;
				}
				public void displayInfo(){
				System.out.println(" The engine power of motorcycle is "+ enginePower);
				super.displayInfo();
		
		 }
	}
		public class VehicleAndTransportSystem{
		public static void main(String [] args){
		
		Car car=new Car(300, " CNG ", 8);
		Truck truck=new Truck(360, "Disel", 18);
		Motorcycle moto= new Motorcycle(180, "Petrol", "350cc");
		
		System.out.print("Car info ");
		car.displayInfo();
		System.out.print("Truck info ");
		truck.displayInfo();
		System.out.print("Motorcycle info ");
		moto.displayInfo();
	}
}