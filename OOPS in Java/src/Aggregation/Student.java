package Aggregation;
/*
 Aggregation:
 				if a class have an entity reference, it is known as Aggregation.
 		
 		 		Aggregation represents HAS-A relationship.
 		 		Student has a address,,...etc
 Use case:
 				Code Re-usability.
 				
 when use Aggregation:
 				Inheritance should be used only if the relationship is-a is maintained 
 				throughout the lifetime of the objects involved; otherwise, aggregation
 				is the best choice
 				
 */

class Address
{
	String city;
	String state;
	String Country;
	public Address(String city,String state, String Country)
	{
		this.city=city;
		this.Country=Country;
		this.state=state;
	}
}

class Student
{
	String name;
	String dept;
	int year;
	Address address;
	public Student(String name, String dept,int year, Address address)
	{
		this.dept=dept;
		this.name=name;
		this.year=year;
		this.address=address;
	}
	void display()
	{
		System.out.println(name+" "+dept+" "+year+" "+address.city+" "+address.state+" "+address.Country);
	}
	public static void main(String args[])
	{
		Address a=new Address("xyz","pqr","India");
		Student s=new Student("Miles morales","CSE",4,a);
		s.display();
		
		
	}
	
}