package Main.Java.Car;

import java.util.ArrayList;
import java.util.*;

public class Car implements CarInterface, Wheel {
    Scanner sc = new Scanner(System.in);

    private final int manufacturingDate;

    private String instanceName;
    private String motorType;
    private int maxSpeedIfNew;
    private int accelerationTime;
    private int passengerCapacity;
    private int currentNumberOfPassengers;
    private int currentSpeed;
    private ArrayList<CarWheel> wheels = new ArrayList<>();
    private ArrayList<CarDoor> doors = new ArrayList<>();

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
        for (int i = 0; i < 3; i++) {
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
        System.out.print("Car  " + this.instanceName + "\n"
                + "дата производства  " + this.manufacturingDate + "\n"
                + "тип двигателя  " + motorType + "\n"
                + "максимальная скорость машины (если она новая)  " + this.maxSpeedIfNew + "\n"
                + "время разгона до 100км/ч  " + accelerationTime + "\n"
                + "пассажировместимость  " + passengerCapacity + "\n"
                + "кол-во пассажиров внутри в данный момент  " + currentNumberOfPassengers + "\n"
                + "текущая скорость  " + currentSpeed + "\n"
                + "массив колес\n\n");
        for (CarWheel i : wheels) {
            i.wheelInfo();
        }
        System.out.println("\nмассив дверей");
        for (CarDoor i : doors) {
            i.doorInfo();
        }
        System.out.print("\nтекущая возможная максимальная скорость  " + (int) currentMaxSpeed() + " км/ч");
    }

    @Override
    public void carInterface() {
/*
        do {
            String i = sc.next();
            switch (i) {
                case "1020101":
                    this.doors.get(0).doorOpened();
                case "1020102":
                    this.doors.get(1).doorOpened();
                case "1020103":
                    this.doors.get(2).doorOpened();
                case "1020104":
                    this.doors.get(3).doorOpened();

                case "1020201":
                    this.doors.get(0).doorClosed();
                case "1020202":
                    this.doors.get(1).doorClosed();
                case "1020203":
                    this.doors.get(2).doorClosed();
                case "1020204":
                    this.doors.get(3).doorClosed();

                case "1020301":
                    this.doors.get(0).doorChanged();
                case "1020302":
                    this.doors.get(1).doorChanged();
                case "1020303":
                    this.doors.get(2).doorChanged();
                case "1020304":
                    this.doors.get(3).doorChanged();

                case "1020401":
                    this.doors.get(0).windowOpened();
                case "1020402":
                    this.doors.get(1).windowOpened();
                case "1020403":
                    this.doors.get(2).windowOpened();
                case "1020404":
                    this.doors.get(3).windowOpened();

                case "1020501":
                    this.doors.get(0).windowClosed();
                case "1020502":
                    this.doors.get(1).windowClosed();
                case "1020503":
                    this.doors.get(2).windowClosed();
                case "1020504":
                    this.doors.get(3).windowClosed();

                case "1020601":
                    this.doors.get(0).windowChanged();
                case "1020602":
                    this.doors.get(1).windowChanged();
                case "1020603":
                    this.doors.get(2).windowChanged();
                case "1020604":
                    this.doors.get(3).windowChanged();

                case "1020701":
                    this.doors.get(0).doorInfo();
                case "1020702":
                    this.doors.get(1).doorInfo();
                case "1020703":
                    this.doors.get(2).doorInfo();
                case "1020704":
                    this.doors.get(3).doorInfo();


                case "20101":
                    tyreChange();
                case "20102":
                    tyreWear();
                case "20103":
                    getTyreStatus();
                case "20104":
                    wheelInfo();


                case "30101":
                case "30102":
                case "30103":
                case "30104":
                case "30105":
                case "30106":
                case "30107":
                case "30108":
                case "30109":
                case "301010":
            }
        } while (sc.hasNext());
*/
    }

    private int wheelChoice() {
        System.out.println("Which wheel?");
        int i;
        while (true) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                return i;
            } else {
                System.out.println("''0'', ''1'', ... etc.");
            }
        }
    }

    @Override
    public void tyreChange() {
        this.wheels.get(wheelChoice()).setTyreStatus(1f);
    }

    public void tyreWear() {

    }

    @Override
    public void tyreWear(int tyreStatus) {

    }

    @Override
    public float getTyreStatus() {
        return 0;
    }

    @Override
    public void setTyreStatus(float tyreStatus) {

    }

    @Override
    public void wheelInfo() {

    }
}
