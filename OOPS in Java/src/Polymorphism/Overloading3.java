package Polymorphism;
// Type Promotion
// The Smaller Data types are converted to Larger Data Types
class Adder3{
	int add(int a, int b)
	{
		System.out.println("method1");
		return (a+b);
	}
	double add(double a,double b)
	{
		System.out.println("method2");
		return (a+b);
	}
	double add(int a,float b)
	{
		System.out.println("method3");
		return (a+b);
	}
	
}
public class Overloading3 {

	public static void main(String[] args) {
		Adder3 a=new Adder3();
		System.out.println(a.add(10, 20));
		System.out.println(a.add(10, 20.6f));
	}

}
