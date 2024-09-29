package inheritence.avoidmultipleInheritence;
class Vehicle {

String type = "4W";

int maxSpeed = 100;

Vehicle(String type, int maxSpeed) {

this.type = type;

this.maxSpeed=maxSpeed;
}
}

class Car extends Vehicle {

String trans;

Car(String trans) {

super("4W", 150);

this.trans = trans;
}
}

public class Test {

public static void main(String[] args) {

Car c= new Car("Auto");

System.out.println(c.type +" "+c.maxSpeed+" "+c.trans);
}
}
