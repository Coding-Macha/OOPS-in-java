package Polymorphism;

class Vehicle{
    public void move(){
    System.out.println("Vehicles can move!!");
    }
}

class MotorBike extends Vehicle{
    public void move(){
    System.out.println("MotorBike can move and accelerate too!!");
    }
}

class OverRiding1{
    public static void main(String[] args){
    Vehicle vh=new MotorBike(); // vehicle is reference type,  and the object being referenced is MotorBike
    vh.move();    // prints MotorBike can move and accelerate too!!
    vh=new Vehicle();
    vh.move();    // prints Vehicles can move!!
    }
}

/*
As the method to call is determined at runtime, this is called dynamic binding or late binding.*/