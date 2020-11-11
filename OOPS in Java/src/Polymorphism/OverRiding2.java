package Polymorphism;


class Bank{  
	int getRateOfInterest(){return 0;}  
}  
 
class SBI extends Bank{  
	int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
	int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
	int getRateOfInterest(){return 9;}  
}  

class OverRiding2{  
public static void main(String args[]){  
		Bank s=new SBI();  
		Bank i=new ICICI();  
		Bank a=new AXIS();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AgXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  

