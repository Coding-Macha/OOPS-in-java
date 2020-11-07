package ObjectsAndClasses;
class Person1{
	int totalBill;
	void after_discount()
	{
		double amount=totalBill-(0.1*totalBill);
		System.out.println(amount);
	}
}
public class TestBillAmount1 {

	public static void main(String[] args) {
		Person1 obj=new Person1();
		obj.totalBill=250;
		obj.after_discount();
		
		
		

	}

}
