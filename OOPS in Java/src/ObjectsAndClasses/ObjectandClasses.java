package ObjectsAndClasses;
/*
 Why OOps: Object-Oriented Programming or OOPs refers to languages that uses objects 
 			in programming. Object-oriented programming aims to implement real-world 
 			entities like inheritance, hiding, polymorphism etc in programming. The 
 			main aim of OOP is to bind together the data and the functions that operate
 			on them so that no other part of the code can access this data except that 
 			function.
 
 
 OOps Concepts: Polymorphism
				Inheritance
				Encapsulation
				Abstraction
				Class
				Object
				Method
				Message Passing
 
 
 
 Object: An entity that has state and behavior is known as an object
 
 State: represents the data (value) of an object.
Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. 
However, it is used internally by the JVM to identify each object uniquely.

Class :   


An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

Object Definitions:

An object is a real-world entity.
An object is a runtime entity.(Because Objects are created run time.)
The object is an entity which has state and behavior.
The object is an instance of a class.
*/
/*
Class can Have
Fields Methods Constructors blocks nested classes and interfaces*/

public class ObjectandClasses
{
	int empid;
	String empname;
	double salary;
	char surname;
	
	public static void main(String args[])
	{
		ObjectandClasses obj = new ObjectandClasses();// here new is used to allocate memory at runtime
		System.out.println(obj.empid);
		System.out.println(obj.empname);
		System.out.println(obj.salary);
		System.out.println(obj.surname);
	}
	
}


/*
 i. Initializing through reference
 i. Initializing through method
 i. Initializing through constructor
*/