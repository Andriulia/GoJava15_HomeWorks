package Main.Java.Car;

public class CarDoor {
	private Status doorStatus;
	private Status windowStatus;
	
    public CarDoor() {
	this.doorStatus = Status.CLOSED;
	this.windowStatus = Status.CLOSED;
	}
	
	public CarDoor(Status doorStatus, Status windowStatus) {
		this.doorStatus = doorStatus;
		this.windowStatus = windowStatus;
	}
	
	public void doorOpened() {
		this.doorStatus = Status.OPENED;
	}
	
	public void doorClosed() {
		this.doorStatus = Status.CLOSED;
	}
	
	public void doorChanged() {
		if (this.doorStatus.equals(Status.CLOSED)) {
		this.doorStatus = Status.OPENED;
		} else {
			this.doorStatus = Status.CLOSED;
		}
	}
	
	public void windowOpened() {
		this.windowStatus = Status.OPENED;
	}

	public void windowClosed() {
		this.windowStatus = Status.CLOSED;
	}

	public void windowChanged() {
		if (this.windowStatus.equals(Status.CLOSED)) {
			this.windowStatus = Status.OPENED;
		} else {
			this.windowStatus = Status.CLOSED;
		}
	}
	
	public void doorInfo() {
		System.out.println("The door is " + doorStatus + ", and the window is " + windowStatus);
	}
}
