class Person4{
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
public class Method {

	public static void main(String[] args) {
		Person4 obj=new Person4();
		Person4 obj2 = new Person4();  
		
		obj.insert(250);
		obj.after_discount();
		obj.insert(350);
		obj.after_discount();
		obj2.insert(990);
		obj2.after_discount();
		obj2.insert(645);
		obj2.after_discount();		
	}

}



