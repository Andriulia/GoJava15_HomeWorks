package Main.Java.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private final int manufacturingDate;

    private String instanceName;
    private String motorType;
    private int maxSpeedIfNew;
    private int accelerationTime;
    private int passengerCapacity;
    private int currentNumberOfPassengers;
    private int currentSpeed;
    private ArrayList<CarWheel> wheels = new ArrayList<CarWheel>();
    private ArrayList<CarDoor> doors = new ArrayList<CarDoor>();

    public Car(int manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Car(String instanceName, int manufacturingDate, String motorType, int maxSpeedIfNew, int accelerationTime, int passengerCapacity, int currentNumberOfPassengers, int currentSpeed, int wheelsAmount) {
        this.instanceName = instanceName;
        this.manufacturingDate = manufacturingDate;
        this.motorType = motorType;
        this.maxSpeedIfNew = maxSpeedIfNew;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.currentSpeed = currentSpeed;
        for (int i = 0; i < wheelsAmount; i++) {
            this.wheels.add(new CarWheel());
        }
        for (int i = 0; i < 4; i++) {
            this.doors.add(new CarDoor());
        }
    }

    public int getManufacturingDate() {
        return manufacturingDate;
    }

    public ArrayList<CarWheel> getWheels() {
        return wheels;
    }

    public ArrayList<CarDoor> getDoors() {
        return doors;
    }

    public void currentSpeedChange(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void putOnePassenger() {
        this.currentNumberOfPassengers++;
    }

    public void dropOffOnePassenger() {
        this.currentNumberOfPassengers--;
    }

    public void dropOffAllPassengers() {
        this.currentNumberOfPassengers = 0;
    }

    public void getTheDoorByIndex(int index) {
        doors.get(index).doorInfo();
    }

    public void getTheWheelByIndex(int index) {
        wheels.get(index).wheelInfo();
    }

    public void wheelsClear() {
        wheels.clear();
    }

    public void addWheels(int newWheelsAmount) {
        if (newWheelsAmount > 0) {
            for (int i = 0; i < newWheelsAmount; i++) {
                this.wheels.add(new CarWheel());
            }
        }
    }

    public float currentMaxSpeed() {
        float temp = wheels.get(0).getTyreStatus();
        for (int i = 1; i < wheels.size(); i++) {
            if (wheels.get(i).getTyreStatus() > temp) {
                temp = wheels.get(i).getTyreStatus();
            }
        }
        if (passengerCapacity == 0) {
            temp = 0f;
        }
        return this.maxSpeedIfNew * temp / 100;
    }

    public void carInfo() {
        System.out.println("Car  " + this.instanceName + "\n"
                + "дата производства  " + this.manufacturingDate + "\n"
                + "тип двигателя  " + motorType + "\n"
                + "максимальная скорость машины (если она новая)  " + this.maxSpeedIfNew + "\n"
                + "время разгона до 100км/ч  " + accelerationTime + "\n"
                + "пассажировместимость  " + passengerCapacity + "\n"
                + "кол-во пассажиров внутри в данный момент  " + currentNumberOfPassengers + "\n"
                + "текущая скорость  " + currentSpeed + "\n"
                + "массив колес\n");
        for (CarWheel i : wheels) {
            i.wheelInfo();
        }
        System.out.println("\nмассив дверей\n");
        for (CarDoor i : doors) {
            i.doorInfo();
        }
        System.out.println("\nтекущая возможная максимальная скорость  " + (int) currentMaxSpeed() + " км/ч");
    }

    public void carInterface() {
        Scanner sc = new Scanner(System.in);
        String s;
        int i, j;
        while (true) {
            System.out.println("Enter:");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                switch (i) {
                    case 1020101: {
                        this.doors.get(0).doorOpened();
                        break;
                    }
                    case 1020102: {
                        this.doors.get(1).doorOpened();
                        break;
                    }
                    case 1020103: {
                        this.doors.get(2).doorOpened();
                        break;
                    }
                    case 1020104: {
                        this.doors.get(3).doorOpened();
                        break;
                    }

                    case 1020201: {
                        this.doors.get(0).doorClosed();
                        break;
                    }
                    case 1020202: {
                        this.doors.get(1).doorClosed();
                        break;
                    }
                    case 1020203: {
                        this.doors.get(2).doorClosed();
                        break;
                    }
                    case 1020204: {
                        this.doors.get(3).doorClosed();
                        break;
                    }

                    case 1020301: {
                        this.doors.get(0).doorChanged();
                        break;
                    }
                    case 1020302: {
                        this.doors.get(1).doorChanged();
                        break;
                    }
                    case 1020303: {
                        this.doors.get(2).doorChanged();
                        break;
                    }
                    case 1020304: {
                        this.doors.get(3).doorChanged();
                        break;
                    }

                    case 1020401: {
                        this.doors.get(0).windowOpened();
                        break;
                    }
                    case 1020402: {
                        this.doors.get(1).windowOpened();
                        break;
                    }
                    case 1020403: {
                        this.doors.get(2).windowOpened();
                        break;
                    }
                    case 1020404: {
                        this.doors.get(3).windowOpened();
                        break;
                    }

                    case 1020501: {
                        this.doors.get(0).windowClosed();
                        break;
                    }
                    case 1020502: {
                        this.doors.get(1).windowClosed();
                        break;
                    }
                    case 1020503: {
                        this.doors.get(2).windowClosed();
                        break;
                    }
                    case 1020504: {
                        this.doors.get(3).windowClosed();
                        break;
                    }

                    case 1020601: {
                        this.doors.get(0).windowChanged();
                        break;
                    }
                    case 1020602: {
                        this.doors.get(1).windowChanged();
                        break;
                    }
                    case 1020603: {
                        this.doors.get(2).windowChanged();
                        break;
                    }
                    case 1020604: {
                        this.doors.get(3).windowChanged();
                        break;
                    }

                    case 1020701: {
                        this.doors.get(0).doorInfo();
                        break;
                    }
                    case 1020702: {
                        this.doors.get(1).doorInfo();
                        break;
                    }
                    case 1020703: {
                        this.doors.get(2).doorInfo();
                        break;
                    }
                    case 1020704: {
                        this.doors.get(3).doorInfo();
                        break;
                    }


                    case 2010101: {
                        this.wheels.get(0).tyreChange();
                        break;
                    }
                    case 2010102: {
                        this.wheels.get(1).tyreChange();
                        break;
                    }
                    case 2010103: {
                        this.wheels.get(2).tyreChange();
                        break;
                    }
                    case 2010104: {
                        this.wheels.get(3).tyreChange();
                        break;
                    }

                    /*case 2010201: {
                            System.out.println("Tyre index (" + (this.wheels.size()-1) + " max):");
							i = intAsker(this.wheels.size());
                                    System.out.println("Wear this tyre by ? % (" + (this.wheels.get(i).getTyreStatus()==1f?100:(int) (this.wheels.get(i).getTyreStatus()*100)) + " max):");
                                        j = intAsker(0, (int) this.wheels.get(i).getTyreStatus()*100);
                                        this.wheels.get(i).tyreWear(j);
                                        break;
                    }*/
                    case 20102: {
						while (true) {
							System.out.println("Tyre index:");
							if (sc.hasNextInt()) {
								i = sc.nextInt();
								while (i < this.wheels.size()) {
									System.out.println("Wear this tyre by ? %:");
									if (sc.hasNextInt()) {
										j = sc.nextInt();
										this.wheels.get(i).tyreWear(j);
										break;
									}
									sc.next();
								}
								break;
							}
							sc.next();
						}
						break;
					}
                    
                    case 20103: {
                        System.out.println("Wheel index (" + this.wheels.size() + " max):");
                        i = sc.nextInt();
                        System.out.println(this.wheels.get(i).getTyreStatus());
                        break;
                    }

                    case 2010401: {
                        this.wheels.get(0).wheelInfo();
                        break;
                    }
                    case 2010402: {
                        while (true) {
                            System.out.println("Wheel index:");
                            if (sc.hasNextInt()) {
                                i = sc.nextInt();
                                while (i < this.wheels.size()) {
                                    this.wheels.get(i).wheelInfo();
                                } 
                                sc.next();
                            } else {
                                if (sc.hasNextLine()) {
                                    s = sc.nextLine();
                                    if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                    case 2010403: {
                        this.wheels.get(2).wheelInfo();
                        break;
                    }
                    case 2010404: {
                        this.wheels.get(3).wheelInfo();
                        break;
                    }


                    case 30101: {
                        System.out.println(this.getManufacturingDate());
                        break;
                    }
                    case 30102: {
                        while (true) {
                            System.out.println("New current speed (" + this.currentMaxSpeed() + "  max): ");
                            sc.next();
                            i = sc.nextInt();
                            if (i <= this.currentMaxSpeed()) {
                                this.currentSpeedChange(i);
                                break;
                            }
                        }
                    }
                    case 30103: {
                        this.putOnePassenger();
                        break;
                    }
                    case 30104: {
                        this.dropOffOnePassenger();
                        break;
                    }
                    case 30105: {
                        this.dropOffAllPassengers();
                        break;
                    }
                    case 30106: {
                        while (true) {
                            System.out.println("Door index:");
                            sc.next();
                            i = sc.nextInt();
                            if (i <= this.doors.size()) {
                                this.getTheDoorByIndex(i);
                                break;
                            }
                        }
                    }
                    case 30107: {
                        while (true) {
                            System.out.println("Wheel index:");
                            sc.next();
                            i = sc.nextInt();
                            if (i <= this.wheels.size()) {
                                this.getTheWheelByIndex(i);
                                break;
                            }
                        }
                    }
                    case 30108:
                        this.wheelsClear();
                    case 30109: {
                            System.out.println("Add ? wheels:");
                            sc.next();
                            j = sc.nextInt();
                        for (i = 0; i < j; i++) {
                            this.wheels.add(new CarWheel());
                        }
                            break;
                    }
                    case 301010: {
                        this.currentMaxSpeed();
                        break;
                    }
                    case 301011: {
                        this.carInfo();
                        break;
                    }
                }
            } else {
				if (sc.hasNextLine()) {
					s = sc.nextLine();
					if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
						System.exit(0);
					}
				}
			}
        }
    }

	/*static int intAsker(int lowerMerge, int upperMerge) {
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		while (true) {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if (i >= lowerMerge && i <= upperMerge) {
					return i;
				}
			} else {
				s = sc.nextLine();
				if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
					System.exit(222);
				}
			}
		}
	}

	static int intAsker(int upperMerge) {
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		while (true) {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if (i > 0 && i < upperMerge) {
					return i;
				}
			} else {
				s = sc.nextLine();
				if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
					System.exit(111);
				}
			}
		}
	}

	static int intAsker() {
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		while (true) {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				return i;
			} else {
				s = sc.nextLine();
				if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
					System.exit(0);
				}
			}
		}
	}*/
}
