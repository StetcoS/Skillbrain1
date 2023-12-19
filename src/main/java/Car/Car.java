package Car;

public class Car {
    private String nume;
    private String culoare;
    private String marca;

    public Car(String nume) {
        this.nume = nume;
    }

    public Car(String nume, String culoare) {
        this(nume);
        this.culoare = culoare;
    }

    public Car() {
    }
}