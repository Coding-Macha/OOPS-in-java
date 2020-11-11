package Polymorphism;

class Adder{
	int add(int a, int b)
	{
		return (a+b);
	}
	int add(int a,int b, int c)
	{
		return (a+b+c);
	}
}
public class Overloading1 {

	public static void main(String[] args) {
		Adder a=new Adder();
		System.out.println(a.add(10, 20));
		System.out.println(a.add(10, 20,30));
	}

}

/*Here we have two definitions of the same method add()
 , which add method would be called is determined by the parameter list at the compile time. That is the reason this is also known as compile time polymorphism.*/
