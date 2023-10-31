package java11;
class Car implements Vehicle {
	public void startEngine() {
		System.out.println("car start Engine");
	}
	public void wheel() {
		System.out.println("car wheel");
	}
	
	
}
class ElectricCar extends Car{
	public void chargeBattery() {
		System.out.println("Electric car");
	}
}
class Bicycle implements Vehicle {
	public void startEngine() {
		System.out.println("bicycle start Eengine");
	}
	public void wheel() {
		System.out.println("car bicycle");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v= new Car();
		Vehicle v1= new Bicycle();
		Vehicle v2 =new ElectricCar();
		v.startEngine();
		v1.startEngine();
		v2.startEngine();
		//v2.chargeBattery(); because chargeBattery is not define in vehicle
		

	}

}
