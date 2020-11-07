package Inheritance;

class Vehicle
{
	void Motor()
	{
		System.out.println("Motor");
	}
}
class Bike extends Vehicle
{
	void wheels1()
	{
		System.out.println("has 2 Wheels");
	} 
}
class Car extends Bike
{
	void wheels2()
	{
		System.out.println("has 4 Wheels");
	} 
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.Motor();
		c.wheels2();
		c.wheels1();
		
	}

}
