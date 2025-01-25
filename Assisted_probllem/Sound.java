class Animal{
String name;
int age;

		Animal( String name, int age){
			this.name= name;
			this.age=age;
		}
		
		void makeSound(){
			System.out.println(" Animal makes a sound " );
		}
		public void displayDeatils(){
			System.out.println(" The name of Animal "+ name);
			System.out.println(" The age of Animal "+age);
			}
			
	}
		class Dog extends Animal{
		public Dog(String name, int age) {
			super(name, age);
			}
		@Override
		void makeSound(){
		System.out.println(" Dog is barking");
		super.displayDeatils(); 
		}
	}
		class Cat extends Animal{
		public Cat(String name, int age) {
			super(name, age);
			}
		@Override
		void makeSound(){
			System.out.println(" Cat is  meows");
			super.displayDeatils();
			}
		}
			class Birds extends Animal{
		
			public Birds(String name, int age) {
			super(name, age);
			}
			
			@Override
			void makeSound(){
				System.out.println("Bird is chirping");
				super.displayDeatils();
			}
		}

			
	public class Sound{
		public static void main(String [] args){
			
			Dog dog = new Dog(" HUSKEY ",  9);
			Cat cat= new Cat(" POOKIE",  4);
			Birds birds= new Birds( " MITTHU ",  1 );
			
			 
			dog.makeSound();
			
			cat.makeSound();
			
			birds.makeSound();
			}
		}
	