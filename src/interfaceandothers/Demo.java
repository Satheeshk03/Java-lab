package interfaceandothers;
class Demo{
	public static void main(String args[]) {
		Car c=new Car();
		c.drive();
		c.honk();
        	
	}
	}
 class Vehicle {
String brand;
String model;
int year;

void drive() {
	
	System.out.println("Drive with comfort");
}
}
class Car extends Vehicle{
	String color;
	void honk() {
		System.out.println("Has the uniqueness");
	}
	
}

	


