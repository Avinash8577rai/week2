public class PersonDeatils{
	String work;
	int age;
	int yearOfBirth;
	
	// Parameterized Constructor
    PersonDeatils(String work, int age, int yearOfBirth) {
        this.work=work;
		this.age=age;
		this.yearOfBirth=yearOfBirth;
	}
		
	PersonDeatils(PersonDeatils previousPersonDeatils){
		this.work=previousPersonDeatils.work;
		 this.age=previousPersonDeatils.age;
		 this.yearOfBirth=previousPersonDeatils.yearOfBirth;
	}
		
	public void displayInfo() {
		System.out.println("Work: " + work + ", Age: " + age+ "  Year Of birth " + yearOfBirth);

	}
	
	public static void main(String[] args) {
	
	
		PersonDeatils person1 = new PersonDeatils("software developer", 25 , 2004);
		System.out.println("Person 1:");
		person1.displayInfo();
		
		PersonDeatils person2 = new PersonDeatils(person1);
		System.out.println("\nPerson 1 (Copy of Person 2):");
		person2.displayInfo();
	}
}