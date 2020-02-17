package Main.Java;

import Main.Java.Car.*;

public class Main {
	public static void main(String[] args) {
		/*CarDoor r1 = new CarDoor();
		r1.windowChanged();
		r1. doorInfo();
		CarDoor r2 = new CarDoor(Status.OPENED, Status.OPENED);
		r2.windowChanged();
		r2.doorInfo();
		CarWheel l1 = new CarWheel(65);
		CarWheel l2 = new CarWheel();
		l2.tyreWearing(0);
		l1.wheelInfo();
		l2.wheelInfo();*/
		
		Car car = new Car("car", 1, "1", 2, 3, 4, 5, 6, 4);
		car.getWheels().get(2).tyreWear(21);
		System.out.println(car.getWheels().get(2).getTyreStatus());
	}
}
