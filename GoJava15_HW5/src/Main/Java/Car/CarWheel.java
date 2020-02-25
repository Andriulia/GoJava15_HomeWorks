package Main.Java.Car;

public class CarWheel {
    private float tyreStatus;

    public CarWheel() {
        this.tyreStatus = 1f;
    }

    public CarWheel(float tyreStatus) {
        this.tyreStatus = tyreStatus;
    }

    public void tyreChange() {
        this.tyreStatus = 1f;
    }

    public void tyreWear(int newWearing) {
            this.tyreStatus -= (float) newWearing / 100;
    }

    public float getTyreStatus() {
        return this.tyreStatus;
    }

    public void wheelInfo() {
        if (tyreStatus == 0.0f) {
            System.out.println("The tyre is worn at all.");
        } else if (tyreStatus == 1f) {
            System.out.println("The tyre is not worn at all.");
        } else {
            System.out.println("The tyre is worn by " + (int) (100 - tyreStatus*100) + " percents.");
        }
    }
}
