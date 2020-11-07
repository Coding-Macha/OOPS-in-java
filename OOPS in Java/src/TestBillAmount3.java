/*
 * 1. Default Constructor or Non paramaterized Constructor
 * 2. Parameterized Constructor
 */
class Person3{
	int totalBill;
	String personName;
	/*public Person3(int n,String name)
	{
		totalBill=n;
		personName=name;
	}
	
	public Person3()
	{
		
	}*/
	void after_discount()
	{
		double amount=totalBill-(0.1*totalBill);
		System.out.println(amount+" "+personName);
	}
}
public class TestBillAmount3 {

	public static void main(String[] args) {
		//Person3 obj= new Person3(250,"Hansolo");
		Person3 obj2=new Person3();
		
		obj2.after_discount();
	
	}

}
