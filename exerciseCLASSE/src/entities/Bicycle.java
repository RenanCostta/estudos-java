package entities;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int engrenagem = 1;

    public Bicycle(int cadence, int speed, int engrenagem) {
        this.cadence = cadence;
        this.speed = speed;
        this.engrenagem = engrenagem;
    }

    public void changeCadence(int newCad) {
        cadence = newCad;
    }
    public void changeGear (int newGear) {
        if (newGear < 6) {
            engrenagem = newGear;
        }
        else {
            System.out.println("Marcha não existente");
        }
    }
    public void speedUp (int incremento) {
        speed += incremento;
    }

    public void applyBreaks (int decremento) {
        speed = speed - decremento;
    }

    public String toString() {
        return "Cadence: " + cadence + " Speed: " + speed + " Gear: " + engrenagem;
    }
}
