package Polymorphism;

class Adder1{
	int add(int a, int b)
	
	{
		System.out.println("Integer");
		return (a+b);
	}
	double add(double a,double b)
	{
		System.out.println("double");
		return (a+b);
	}
}
public class Overloading2 {

	public static void main(String[] args) {
		Adder1 a=new Adder1();
		System.out.println(a.add(10, 20));
		System.out.println(a.add(10.2, 20.6));
	}

}
