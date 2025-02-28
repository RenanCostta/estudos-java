package entities;

public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeSpeed(int newValue) {
        speed = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public String toString() {
        return "cadence: "
                + cadence
                + " speed: "
                + speed
                + " gear: "
                + gear;
    }

}
