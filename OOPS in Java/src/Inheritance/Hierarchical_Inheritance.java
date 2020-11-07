package Inheritance;

class Fruit
{
	void RichIn()
	{
		System.out.println("Vitamins and Minerals");
	}
}
class mango  extends Fruit
{
	void color1()
	{
		System.out.println("is in yellow color");
	} 
}
class Orange extends Fruit
{
	void color2()
	{
		System.out.println("is in Orange color");
	} 
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Orange r = new Orange();
		//r.color1();
		r.color2();
		r.RichIn();
		
		
	}

}
