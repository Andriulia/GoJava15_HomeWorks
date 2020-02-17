package Main.Java.Car;

public class CarWheel implements Wheel {
    private float tyreStatus;

    public CarWheel() {
        this.tyreStatus = 1f;
    }

    public CarWheel(float tyreStatus) {
        this.tyreStatus = tyreStatus;
    }

    @Override
    public void tyreChange() {
        this.tyreStatus = 1f;
    }

    @Override
    public void tyreWear(int tyreStatus) {
        this.tyreStatus -= (float) tyreStatus / 100;
        this.tyreStatus *= 100;
    }

    @Override
    public float getTyreStatus() {
        return this.tyreStatus;
    }

    @Override
    public void setTyreStatus(float tyreStatus) {
        this.tyreStatus = tyreStatus;
    }

    @Override
    public void wheelInfo() {
        if (tyreStatus == 0.0f) {
            System.out.println("The tyre is worn at all.");
        } else if (tyreStatus != 1f & tyreStatus != 100.0f) {
            System.out.println("The tyre is worn by " + (int) (100 - tyreStatus) + " percents.");
        } else {
            System.out.println("The tyre is not worn at all.");
        }
    }
}
