package ObjectsAndClasses;
// Initializing through the method

class Person2{
	int totalBill;
	void insert(int d)
	{
		totalBill=d;
	}
	void after_discount()
	{
		double amount=totalBill-(0.1*totalBill);
		System.out.println(amount);
	}
}
public class TestBillAMount2 {

	public static void main(String[] args) {
		Person2 obj=new Person2();
		obj.insert(250);
		obj.after_discount();
		
		
		
		

	}

}
