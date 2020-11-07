
package Inheritance;
/*
 Inheritance: One Object Acquiring all the the properties and Behavior of Parent 
 			  Object is Called Inheritance
 			  
 Inheritance Represents IS-A RelationShip.
 
 
 	Inheritance Will be Used in the Cases where the child Parent Relationships are Like
 	whale and Mammal
 	employee and Human
 	etc
  
 Types:
 		Single Inheritance - only one parent and one child
 		MultiLevel Inheritance - chain of Inheritance ( C extends B, B extends A )
 		Hierarchical Inheritance - each child inherits only super class(Parent class or Base Class).
 		Multiple Inheritance - each class can inherit more than one class(which is Not supported in java)
 		Hybrid Inheritance - Having Both Single and Multiple Inheritance
 		
 		
 */
class Animal
{
	 void Eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends  Animal
{
	void Bark()
	{
		System.out.println("Barking");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.Bark();
		obj.Eat();

	}

}
