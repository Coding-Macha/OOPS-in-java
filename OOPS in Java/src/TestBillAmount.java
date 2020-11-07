class Person{
	int totalBill=250;
	void after_discount()
	{
		double amount=totalBill-(0.1*totalBill);
		System.out.println(amount);
	}
}



public class TestBillAmount {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.after_discount();

	}

}
