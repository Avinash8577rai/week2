class Device{
String deviceId;
String status;

	Device(String deviceId, String status){
	this.deviceId=deviceId;
	this.status=status;
	}
	
	public void displayStatus(){
	System.out.println("The device id is "+ deviceId);
	System.out.println(" The device status is " + status);
	}
}
class Thermostat extends Device{
String temperatureSetting;
	
	Thermostat(String deviceId, String status, String temperatureSetting){
	super( deviceId, status);
	this.temperatureSetting=temperatureSetting;
	}
	
	public void displayStatus(){
	System.out.println("The device temperature is " + temperatureSetting );
	super.displayStatus();
	}
}
public class SmartHomeDevices{
 public static void main(String[] args){
	Thermostat thermo= new Thermostat("E-78545852", "Connected", "26.C" );
	
	System.out.println(" The themostat info is ");
	thermo.displayStatus();
	
	}
}